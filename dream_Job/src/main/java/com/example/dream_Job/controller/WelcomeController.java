package com.example.dream_Job.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, @RequestParam int age) {
    return "hello " + name + " " + age;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello ";
    }

    @GetMapping("/welcome")
    public String hello(@RequestParam int age, @RequestParam String name) {
        return "hello " + age + name;
    }

}
