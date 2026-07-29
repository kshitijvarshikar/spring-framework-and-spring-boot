package in.strikes.Lecture11_crudSpringBootDemo.controller;

import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import in.strikes.Lecture11_crudSpringBootDemo.service.StudentService;
import jakarta.persistence.Entity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //→ Marks a class as a REST API controller.
@RequestMapping("/app/students") //→ Sets the base URL for all API methods in the controller.
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // create student
    @PostMapping("/create") //→ Maps an HTTP POST request to a method (used to create new data).
    public ResponseEntity<Student> createStudent(@RequestBody Student student){ //→ Converts the request's JSON data into a Java object.

        Student createdStudent = studentService.createStudent(student);
//        return ResponseEntity.ok(createdStudent);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }

    // read student
    @GetMapping("/get")
    public ResponseEntity<Student> getStudent(@RequestParam Long id){
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getStudent(){
        List<Student> studentList = studentService.getAllStudent();

        if(studentList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentList);
    }

    // update student
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestParam Long id,
                                                 @RequestBody Student studentReq){
        Student studentResp = studentService.updateStudent(id, studentReq);

        if(studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
    }

    // delete student
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id) {
        Boolean isDeleted = studentService.deleteStudent(id);

        if(!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record deleted");
    }

    @PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        Boolean isDeleted = studentService.deleteStudentSoftly(id);

        if(!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record deleted");

    }

}
