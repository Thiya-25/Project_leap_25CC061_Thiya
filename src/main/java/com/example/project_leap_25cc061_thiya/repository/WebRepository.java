package com.example.project_leap_25cc061_thiya.repository;

import com.example.project_leap_25cc061_thiya.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebRepository extends JpaRepository<Student, Long> {

}