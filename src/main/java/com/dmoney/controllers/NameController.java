package com.dmoney.controllers;

import com.dmoney.dto.NameList;
import com.dmoney.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by drew on 3/10/17.
 */
@Controller
public class NameController {

    private NameService nameService;

    @Autowired
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @RequestMapping(value = "/names/{name}", method = RequestMethod.POST)
    @ResponseBody
    public String postName(@PathVariable String name) {
        nameService.addName(name);
        return "SUCCESS";
    }

    @RequestMapping(value = "/names/clear/{name}", method = RequestMethod.POST)
    @ResponseBody
    public String clearName(@PathVariable String name) {
        nameService.clearName(name);
        return "SUCCESS";
    }

    @RequestMapping(value = "/names/clear", method = RequestMethod.POST)
    @ResponseBody
    public String clearNames() {
        nameService.clearNames();
        return "SUCCESS";
    }

    @RequestMapping("/names")
    @ResponseBody
    public NameList getNames() {
        return nameService.getNames();
    }


}
