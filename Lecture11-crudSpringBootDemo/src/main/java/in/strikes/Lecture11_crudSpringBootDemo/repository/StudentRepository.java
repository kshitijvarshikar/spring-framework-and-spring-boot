package in.strikes.Lecture11_crudSpringBootDemo.repository;

import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student studentReq){
        // save to DB
        System.out.println("Inside Student Repository");
        System.out.println("Existing Student Repository");

        Student s1 = new Student();
        s1.setName("Kshitij");
        s1.setAge(20);
        s1.setEmail("kshitij@gmail.com");
        s1.setRollNo(101);
        s1.setSubject("Spring-Framework");

        return s1;
    }
}
