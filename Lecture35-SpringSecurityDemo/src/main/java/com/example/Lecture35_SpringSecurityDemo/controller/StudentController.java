package com.example.Lecture35_SpringSecurityDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public ResponseEntity<String> getStudents() {
        return ResponseEntity.ok("Student Retrieved Successfully");
    }

    @PostMapping
    public ResponseEntity<String> createStudent() {
        return ResponseEntity.ok("Student Created Successfully");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteStudent() {
        return ResponseEntity.ok("Student Deleted Successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateStudent() {
        return ResponseEntity.ok("Student Updated Successfully");
    }

    @GetMapping("/csrf")
    public CsrfToken csrfToken(CsrfToken csrfToken) {
        return csrfToken;
    }
}
