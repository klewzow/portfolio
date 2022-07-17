package com.gmail.klewzow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerFull {

    @GetMapping("")
   public String indexPage(){
        return "index";
    }
    @GetMapping("/skill")
    public String skillPage(){
        return "index";
    }
    @GetMapping("/project")
    public String projectPage(){
        return "index";
    }
    @GetMapping("/contact")
    public String contactPage(){
        return "index";
    }
}
