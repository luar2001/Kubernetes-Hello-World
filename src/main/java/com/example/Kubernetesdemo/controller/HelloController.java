package com.example.Kubernetesdemo.controller;

import com.example.Kubernetesdemo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path ="/api/hello-world")
    public String helloWorld(){
        return HelloService.helloWorld();
    }

}
