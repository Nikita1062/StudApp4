package com.jjm.stdApp4.Service;

import com.jjm.stdApp4.entity.Student;
import com.jjm.stdApp4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository  studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
