<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row-fluid">
    <c:if test="${not empty message}">
    <div class="well">
        ${message}
    </div>
    </c:if>

    <h1>Bands</h1>
    <ul>
        <c:forEach items="${bands}" var="band">
            <li>${band}</li>
        </c:forEach>
    </ul>
</div>