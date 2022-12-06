package com.example.courseapp.controller;

import com.example.courseapp.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration());
        System.out.println(c.getDate().toString());
        return "course added successfully";
    }
}
