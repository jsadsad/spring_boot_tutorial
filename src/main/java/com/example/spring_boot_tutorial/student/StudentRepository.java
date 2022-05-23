package com.example.spring_boot_tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // this interface is responsible for data access
public interface StudentRepository
        extends JpaRepository<Student, Long> { // <Type we want to work with, ID for the student and the type is Long>

    // This will transform from SQL
    // SELECT * FROM student WHERE email = ?

    // We are able to take the Student model because of its @Entity annotation
    // This is JBQL and not SQL
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
