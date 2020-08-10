package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    //GET / POST / PUT / OPTIONS

    @GetMapping
    public String getHelloWorld(){

        return "Hello World Project OpenShift";
    }

    @GetMapping ("/{input}")
    public String getHelloWorld(@PathVariable String input){

        return "Olá "+ input;
    }



}
