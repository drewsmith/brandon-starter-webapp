package com.dmoney.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

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
    public String getAbout(Model model) {
        model.addAttribute("message", "This message is for Brandon.");
        model.addAttribute("bands", Arrays.asList("BTBAM", "Queen", "Bob Marley"));
        return "about";
    }

}
