package com.example.Lecture22_AopIntroductionDemo.service;

import com.example.Lecture22_AopIntroductionDemo.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class LoggingDecorator implements StudentService {

    private StudentServiceImpl studentServiceImpl;

    public LoggingDecorator(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Override
    public void createStudent(Student student) {
        // logging related logic
        LoggingServiceUtil.logStart(
                "StudentServiceImpl", "createStudent");

        studentServiceImpl.createStudent(student);

        LoggingServiceUtil.logEnd(
                "StudentServiceImpl", "createStudent");
    }
}
