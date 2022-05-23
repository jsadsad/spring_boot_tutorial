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
        return studentRepository.findAll(); // this returns a list to us
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
