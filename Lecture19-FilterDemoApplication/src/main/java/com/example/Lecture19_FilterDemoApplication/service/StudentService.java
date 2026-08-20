package com.example.Lecture19_FilterDemoApplication.service;

import com.example.Lecture19_FilterDemoApplication.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public void createStudent(Student student){
        System.out.println("Student Created");
        System.out.println(student.getName());
        System.out.println(student.getEmail());

/*
        // For Response Time Varify
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/
    }
}
