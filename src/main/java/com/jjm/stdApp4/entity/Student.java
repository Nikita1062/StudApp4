package com.jjm.stdApp4.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
@Data
public class Student {

    @Id
    private int id;
    private String firstName;
    private String lastName;
}
