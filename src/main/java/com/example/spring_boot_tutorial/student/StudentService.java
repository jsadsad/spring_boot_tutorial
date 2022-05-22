package com.example.spring_boot_tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Component // This allows this class to be a Spring Bean that recognizes it has to be instantiated to be autowired
@Service // this is the same as @Component but is more semantic.
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
/*        return List.of(
                new Student(
                        1L,
                        "Joshua",
                        "test@example.com",
                        LocalDate.of(1994, Month.OCTOBER, 21),
                        28
                )
        );*/
        return studentRepository.findAll(); // this returns a list to us
    }
}
