package Aston.zadanie2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private Integer yearOfPublication;
    private Integer pages;

    public Book(String[] details) {
        this.name = details[0];
        this.yearOfPublication= Integer.valueOf(details[1]);
        this.pages= Integer.valueOf(details[2]);
    }
}
