package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/jenkins")
public class JenkinsController {

    @GetMapping
    public String getHello(){
        return "Sample running resource for jenkins";
    }
}
