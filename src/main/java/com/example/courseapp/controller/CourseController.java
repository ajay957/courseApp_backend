package com.example.courseapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CourseController {

    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page";
    }


}
