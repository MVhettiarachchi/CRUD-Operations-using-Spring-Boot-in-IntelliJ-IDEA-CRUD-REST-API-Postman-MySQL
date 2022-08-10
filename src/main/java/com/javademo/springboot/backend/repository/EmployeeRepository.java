package com.javademo.springboot.backend.repository;

import com.javademo.springboot.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
