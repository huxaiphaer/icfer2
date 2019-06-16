package com.icfer.v2.icfer2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


    @GetMapping(value = "/")
    public String hello() {

        return "Hello World.";
    }
}
