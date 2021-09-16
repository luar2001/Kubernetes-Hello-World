package com.example.Kubernetesdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public static String helloWorld(){
        return "Hello World!";
    }
}
