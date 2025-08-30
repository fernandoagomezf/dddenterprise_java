package com.vantagepoint.application.controllers;

import java.lang.String;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public final String hello() {
        return "VantagePoint is running!";
    }
}
