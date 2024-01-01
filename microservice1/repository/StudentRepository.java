package com.example.microservice1.repository;

import com.example.microservice1.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// we created a model that contains all methods to work on the student table
//   we pass sCHEMA NAME AND PRIMARY KEY TYPE

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {

}
