package com.example.project_leap_25cc061_thiya.services;

import com.example.project_leap_25cc061_thiya.model.Student;

import java.util.List;

public interface WebService {

String writeData(String text);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudents();
    Student updateStudent(Student student);
}