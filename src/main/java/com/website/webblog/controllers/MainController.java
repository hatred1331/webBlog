package com.website.webblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    //http:localhost:8080/main/**

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }

}
