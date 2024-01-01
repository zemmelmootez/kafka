package com.example.microservice1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")  //reference ici table esmha etudiant fl base
public class Student {
    // n7oto les attributs fl base

    @Id
    private Integer emp_id;
    //@Column(name = "email")
    private Integer age;
    private LocalDate dob;
    private String email ;
    private String name;


}
