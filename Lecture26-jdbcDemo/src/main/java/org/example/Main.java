package org.example;

import org.example.model.Student;
import org.example.repository.StudentRepository;

public class Main {
    public static void main() {

        StudentRepository studentRepository = new StudentRepository();

//        studentRepository.createStudent(new Student(23, "mrunali@gmail.com", "Mrunali"));

//        studentRepository.updateStudent(new Student(28, "rohitnegi@gmail.com", "Rohit Negi"), 7L);

//        studentRepository.deleteStudent(7L);

//        studentRepository.getStudentById(5L);

        studentRepository.getStudent();
    }
}