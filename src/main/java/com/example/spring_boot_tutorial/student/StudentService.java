package com.example.spring_boot_tutorial.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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
