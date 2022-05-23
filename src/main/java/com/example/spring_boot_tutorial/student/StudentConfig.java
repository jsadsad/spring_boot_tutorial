package com.example.spring_boot_tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.OCTOBER;

@Configuration
public class StudentConfig {
    // We want this to be a bean
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repo) {
        return args -> {
            Student josh = new Student(
                    "Joshua",
                    "test@example.com",
                    LocalDate.of(1994, OCTOBER, 21),
                    28
            );

            Student chris = new Student(
                    "Chris",
                    "chris@example.com",
                    LocalDate.of(1994, OCTOBER, 26),
                    28
            );

            repo.saveAll(List.of(josh, chris));
        };
    }
}
