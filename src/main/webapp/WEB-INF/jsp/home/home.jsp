<div class="row-fluid">
    <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" class="form-control" id="name">
    </div>
    <button class="btn btn-default" id="add-name-btn">Add Name</button>
</div>
<div class="row-fluid">
    <h1>
        Names
        <i class="glyphicon glyphicon-remove small clickable" aria-hidden="true" id="clear-names-icon"></i>
    </h1>
    <ul id="name-list"></ul>
</div>

<script type="text/javascript">
(function($) {
    var nameInput = document.getElementById('name');
    var addNameBtn = document.getElementById('add-name-btn');
    var nameList = document.getElementById('name-list');
    var clearNamesIcon = document.getElementById('clear-names-icon');

    addNameBtn.addEventListener('click', _onAddNameClick);
    clearNamesIcon.addEventListener('click', _onClearNamesClick);

    // intialize list with anything in memory
    _getNames();

    function _onClearNamesClick() {
        $.post('/names/clear', _getNames);
    }

    function _onAddNameClick() {
        $.post('/names/' + nameInput.value, _getNames);
    }

    function _getNames() {
        $.get('/names', _appendNames);
    }

    function _appendNames(response) {
        nameList.innerHTML = '';
        response.names.forEach(function(name) {
           var nameItem = document.createElement('li');
           nameItem.innerHTML = name;
           nameItem.classList.add('name-item');
           nameItem.addEventListener('click', _clearName);

           nameList.appendChild(nameItem);
        });
    }

    function _clearName() {
        $.post('/names/clear/' + this.innerHTML, _getNames);
    }
})(jQuery);
</script>