package in.strikes.Lecture11_crudSpringBootDemo.repository;

import in.strikes.Lecture11_crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> id(long id);
}
