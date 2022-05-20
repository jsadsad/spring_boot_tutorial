package com.example.spring_boot_tutorial;

import com.example.spring_boot_tutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// @SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping // This is now a REST endpoint
    public List<Student> hello() {
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


