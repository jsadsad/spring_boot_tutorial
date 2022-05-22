package com.example.spring_boot_tutorial.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// This class will have all the resources for the API
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping // This is now a REST endpoint
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Joshua",
                        "test@example.com",
                        LocalDate.of(1994, Month.OCTOBER, 21),
                        28
                )
        );
    }
}
