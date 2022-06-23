package com.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/")
    public String helloworld()
    {
        return "Hello world from Spring Boot";
    }


}
