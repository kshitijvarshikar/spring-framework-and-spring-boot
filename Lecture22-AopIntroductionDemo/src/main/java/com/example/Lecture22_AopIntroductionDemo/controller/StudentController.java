package com.example.Lecture22_AopIntroductionDemo.controller;

import com.example.Lecture22_AopIntroductionDemo.dto.Student;
import com.example.Lecture22_AopIntroductionDemo.service.StudentService;
import com.example.Lecture22_AopIntroductionDemo.service.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok("Done");
    }
}
