package com.gmail.klewzow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class ControllerFull {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexFulPage() {
        return "index";
    }


    private final String cvPage = "cv";
    @RequestMapping(value = ("/" + cvPage), method = RequestMethod.GET)
    public String cv() {
        return cvPage;
    }

    private final String doc = "doc";
    @RequestMapping(value = ("/" + doc), method = RequestMethod.GET)
    public String doc() {
        return doc +"/doc.pdf";
    }

    private final String java = "java";
    @RequestMapping(value = ("/" + java), method = RequestMethod.GET)
    public String javaPage() {
        return java ;
    }
    private final String layout = "layout";
    @RequestMapping(value = ("/" + layout), method = RequestMethod.GET)
    public String layoutPage() {
        return layout ;
    }
    private final String c = "c";
    @RequestMapping(value = ("/" + c), method = RequestMethod.GET)
    public String cPage() {
        return c ;
    }
}
