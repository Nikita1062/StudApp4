package com.jjm.stdApp4.Service;

import com.jjm.stdApp4.entity.Student;

import java.util.List;

public interface StudentService {


    static Student upadteStudent(int id, Student student) {
        return student;
    }

    void addStudent(Student student);

    List<Student> showAllStudents();


    void deleteById(int id);

    Student updateStudent(int id, Student student);
}
