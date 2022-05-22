package com.example.spring_boot_tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// This class will have all the resources for the API
// This API layer should talk to the Service Layer
// Service layer should talk to the Data Access Layer
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController { // StudentController has a reference to StudentService

    private final StudentService studentService;

    @Autowired // this is the dependency injection
    // Autowired automatically instantiates the studentService variable and then injected into this constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService; // this won't work without Autowired
    }


    @GetMapping // This is now a REST endpoint
    public List<Student> getStudents() {
        return studentService.getStudents(); // this follows N-Tier Design Pattenr
    }
}
