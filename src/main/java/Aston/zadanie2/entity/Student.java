package Aston.zadanie2.entity;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String surName;
    private String lastName;
    private Integer age;
    private List<Book> bookList;

    public Student(String[] details) {
        this.surName = details[0];
        this.lastName= details[1];
        this.age= Integer.valueOf(details[2]);
    }
}
