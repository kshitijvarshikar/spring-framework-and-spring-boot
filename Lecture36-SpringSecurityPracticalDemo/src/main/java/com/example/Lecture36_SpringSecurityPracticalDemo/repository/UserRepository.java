package com.example.Lecture36_SpringSecurityPracticalDemo.repository;

import com.example.Lecture36_SpringSecurityPracticalDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
