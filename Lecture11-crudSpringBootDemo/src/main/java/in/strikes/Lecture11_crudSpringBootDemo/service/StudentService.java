package in.strikes.Lecture11_crudSpringBootDemo.service;

import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import in.strikes.Lecture11_crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //→ Marks a class as a service that contains the application's business logic.
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent (Student studentReq){
        // business logic
        // store to db
        System.out.println("Inside Student Service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting Student Service");
        return studentReq;
    }

}

/*
 1. End Point Listen (/app/students Post)
 2. Business Logic
 3. Interact with DB to store
 4. response back to client (postman)
*/
