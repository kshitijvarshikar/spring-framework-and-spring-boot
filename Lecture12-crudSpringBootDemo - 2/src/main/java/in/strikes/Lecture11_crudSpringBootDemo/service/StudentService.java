package in.strikes.Lecture11_crudSpringBootDemo.service;

import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import in.strikes.Lecture11_crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service //→ Marks a class as a service that contains the application's business logic.
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent (Student studentReq){
        // business logic
        // store to db
        Student studentResp = studentRepository.save(studentReq);
        return studentReq;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id);

        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student updateStudent(Long id, Student studentReq){
        Optional<Student> existingStudent = studentRepository.findById(id);

        if (existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave = existingStudent.get();

        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setAge(studentReq.getAge());

        return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long id) {
        Boolean isStudent = studentRepository.existsById(id);

        if(!isStudent) return false;

        studentRepository.deleteById(id);

        return true;
    }


}

/*
 1. End Point Listen (/app/students Post)
 2. Business Logic
 3. Interact with DB to store
 4. response back to client (postman)
*/
