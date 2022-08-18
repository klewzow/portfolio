package com.gmail.klewzow.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
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
        return "progect";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactPage() {
        return "index";
    }

    @RequestMapping(value = "/document__generator", method = RequestMethod.GET)
    public String document__generator() {
        return "document__generator";
    }


}
