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

    public Student createStudent(Student studentReq) {

        studentReq.setDeleted(false);

        return studentRepository.save(studentReq);
    }

    public Student getStudent(Long id) {

        Optional<Student> studentResp =
                studentRepository.findByIdAndDeletedFalse(id);

        return studentResp.orElse(null);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findByDeletedFalse();
    }

    public Student updateStudent(Long id, Student studentReq) {

        Optional<Student> existingStudent =
                studentRepository.findByIdAndDeletedFalse(id);

        if (existingStudent.isEmpty()) {
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

    public Boolean deleteStudentSoftly(Long id) {

        Optional<Student> student =
                studentRepository.findByIdAndDeletedFalse(id);

        if (student.isEmpty()) {
            return false;
        }

        Student studentToDelete = student.get();
        studentToDelete.setDeleted(true);
        studentRepository.save(studentToDelete);
        return true;
    }


}

/*
 1. End Point Listen (/app/students Post)
 2. Business Logic
 3. Interact with DB to store
 4. response back to client (postman)
*/
