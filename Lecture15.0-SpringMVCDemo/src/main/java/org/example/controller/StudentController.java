package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq) {

        Student savedStudent = studentService.createStudent(studentReq);

        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> studentResp = studentService.getAllStudent();

        return ResponseEntity.ok(studentResp);
    }
}