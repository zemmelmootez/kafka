package com.example.microservice1.service;

import com.example.microservice1.Entity.Student;
import com.example.microservice1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

}
