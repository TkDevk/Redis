package com.learning.sprgbt.returning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/test")
    public String hello(){
        return "Hello World";
    }
}
