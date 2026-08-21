package com.example.Lecture19_FilterDemoApplication.service;

import com.example.Lecture19_FilterDemoApplication.dto.Student;
import com.example.Lecture19_FilterDemoApplication.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public StudentResponseDto createStudent(Student student) {
        StudentResponseDto responseDto = new StudentResponseDto();
        responseDto.setName(student.getName());
        responseDto.setMessage("Student is saved Successfully");

        return responseDto;
    }
}
