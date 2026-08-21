package com.example.Lecture19_FilterDemoApplication.controller;

import com.example.Lecture19_FilterDemoApplication.dto.Student;
import com.example.Lecture19_FilterDemoApplication.dto.StudentResponseDto;
import com.example.Lecture19_FilterDemoApplication.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponseDto> createStudent(@RequestBody Student student) {
        StudentResponseDto responseDto = studentService.createStudent(student);
        return ResponseEntity.ok(responseDto);
    }
}
