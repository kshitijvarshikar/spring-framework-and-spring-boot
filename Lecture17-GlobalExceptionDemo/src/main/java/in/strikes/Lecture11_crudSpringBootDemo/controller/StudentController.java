package in.strikes.Lecture11_crudSpringBootDemo.controller;

import in.strikes.Lecture11_crudSpringBootDemo.dto.CreateStudentRequestDto;
import in.strikes.Lecture11_crudSpringBootDemo.dto.CreateStudentResponseDto;
import in.strikes.Lecture11_crudSpringBootDemo.dto.UpdateStudentReqestDto;
import in.strikes.Lecture11_crudSpringBootDemo.dto.UpdateStudentResponseDto;
import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import in.strikes.Lecture11_crudSpringBootDemo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //→ Marks a class as a REST API controller.
@RequestMapping("/api/students") //→ Sets the base URL for all API methods in the controller.
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // create student
    @PostMapping //→ Maps an HTTP POST request to a method (used to create new data).
    public ResponseEntity<CreateStudentResponseDto> createStudent(
            @Valid @RequestBody CreateStudentRequestDto studentRequestDto){ //→ Converts the request's JSON data into a Java object.

        CreateStudentResponseDto createdStudent = studentService.createStudent(studentRequestDto);
//        return ResponseEntity.ok(createdStudent);
        return ResponseEntity // full form
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }

    // read student
    @GetMapping("/{id}")
    public ResponseEntity<CreateStudentResponseDto> getStudent(@PathVariable Long id){
        CreateStudentResponseDto studentResp = studentService.getStudent(id);

        return ResponseEntity.ok(studentResp); // short form
    }

    @GetMapping
    public ResponseEntity<List<CreateStudentResponseDto>> getStudent(){
        List<CreateStudentResponseDto> studentList = studentService.getAllStudent();

        return ResponseEntity.ok(studentList);
    }

    // update student
    @PutMapping
    public ResponseEntity<UpdateStudentResponseDto> updateStudent(@RequestParam Long id,
                                                 @RequestBody UpdateStudentReqestDto studentReq){
        UpdateStudentResponseDto studentResp = studentService.updateStudent(id, studentReq);

        return ResponseEntity.ok(studentResp);
    }

    // delete student
    @DeleteMapping
    public ResponseEntity<String> deleteStudent(@RequestParam Long id) {
        studentService.deleteStudent(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        studentService.deleteStudentSoftly(id);

        return ResponseEntity.noContent().build();

    }

}
