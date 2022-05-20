package com.example.spring_boot_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping // This is now a REST endpoint
    public List<String> hello() {
        return List.of("Hello", "World");
    }
}


