package com.example.courseapp.controller;

import com.example.courseapp.dao.CourseDao;
import com.example.courseapp.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page";
    }
    @CrossOrigin(origins = "*")

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "course added successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Courses> ViewCourse(){
        return(List<Courses>) dao.findAll();
    }
}
