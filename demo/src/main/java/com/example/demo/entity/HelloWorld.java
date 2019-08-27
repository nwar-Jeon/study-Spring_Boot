package com.example.demo.entity;

public class HelloWorld {
    private final long id;
    private final String name;
    public HelloWorld(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
