package com.dmoney.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by drew on 3/10/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex() {
        return "home";
    }

    @RequestMapping("/about")
    public String getAbout() {
        return "about";
    }

}
