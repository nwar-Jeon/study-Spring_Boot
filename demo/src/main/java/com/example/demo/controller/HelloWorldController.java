package com.example.demo.controller;


import com.example.demo.entity.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {
    private final AtomicLong count = new AtomicLong();
    private static final String template = "Hello, ";

    @RequestMapping("/showHelloWorld")
    public List<HelloWorld> helloWorld(@RequestParam(value = "name", defaultValue = "World")String name){
        List<HelloWorld> array = new ArrayList<>();
        for(int i=0; i<6; i++) {
            array.add(new HelloWorld(count.incrementAndGet(), template + name));
        }
        return array;
    }
}
