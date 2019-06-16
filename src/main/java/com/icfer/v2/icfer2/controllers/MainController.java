package com.icfer.v2.icfer2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/huxy")
    public String init() {

        return "index";
    }
}
