package com.example.Lecture36_SpringSecurityPracticalDemo.repository;

import com.example.Lecture36_SpringSecurityPracticalDemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
