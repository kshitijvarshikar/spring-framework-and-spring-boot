package com.example.Lecture22_AopIntroductionDemo.service;

import com.example.Lecture22_AopIntroductionDemo.dto.Student;
import com.example.Lecture22_AopIntroductionDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student) {

//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            studentRepository.save(student);
//        }

    }
}
