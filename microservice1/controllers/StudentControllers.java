package com.example.microservice1.controllers;

import com.example.microservice1.Entity.Student;
import com.example.microservice1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllers {

    // create a new instance
    @Autowired
    public StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getStudent(){
       return studentService.getStudent();
    }

}
