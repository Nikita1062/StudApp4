package com.jjm.stdApp4.controller;

import com.jjm.stdApp4.Service.StudentService;
import com.jjm.stdApp4.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student Added";
    }
    @GetMapping("/showAllStudents")
    public List<Student> showAllStudents (){
       return studentService.showAllStudents();
    }

   @DeleteMapping("deleteByid /{id}")
     public String deleteByid(@PathVariable("id")int id){

        studentService.deleteById(id);
        return "record deleted for id :" +id;
   }

    @PutMapping("updateById/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        return StudentService.upadteStudent(id,student);
    }

}
