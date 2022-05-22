package com.example.spring_boot_tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // this interface is responsible for data access
public interface StudentRepository
        extends JpaRepository<Student, Long> { // <Type we want to work with, ID for the student and the type is Long>

}
