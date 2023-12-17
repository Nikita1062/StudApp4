package com.jjm.stdApp4.repository;

import com.jjm.stdApp4.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {

    void deleteById(int id);

    Student save(Student student1);
}
