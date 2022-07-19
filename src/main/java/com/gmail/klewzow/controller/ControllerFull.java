package com.gmail.klewzow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerFull {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }


    @RequestMapping(value = "/skill", method = RequestMethod.GET)
    public String skillPage() {
        return "index";
    }

    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public String projectPage() {
        return "index";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage() {
        return "index";
    }
}
