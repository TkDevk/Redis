package com.learning.sprgbt.returning.Controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
//@Log4j2
public class GreetingController {
    @GetMapping("/test")
    public String hello(){
        log.info("Hello there");
        return "Hello World";
    }

}
