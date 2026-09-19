package com.example.project_leap_25cc061_thiya.services.impl;

import com.example.project_leap_25cc061_thiya.model.Student;
import com.example.project_leap_25cc061_thiya.repository.WebRepository;
import com.example.project_leap_25cc061_thiya.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl implements WebService {

    @Autowired
    private WebRepository webRepository;

    @Override
    public String writeData(String text) {
        return "";
    }

    @Override
    public Student saveStudent(Student student) {
        return webRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        webRepository.deleteById(id);
    }

    @Override
    public List<Student> readStudents() {
        return webRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return webRepository.save(student);
    }
}