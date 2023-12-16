package com.jjm.stdApp4.controller;

import com.jjm.stdApp4.Service.StudentService;
import com.jjm.stdApp4.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student Added";
    }
}
