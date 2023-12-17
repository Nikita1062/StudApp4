package com.jjm.stdApp4.Service;

import com.jjm.stdApp4.entity.Student;
import com.jjm.stdApp4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository  studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> showAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
   public Student updateStudent(int id, Student student){
        Student student1= studentRepository.findById(id).get();

        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());

        return studentRepository.save(student1);
    }

}
