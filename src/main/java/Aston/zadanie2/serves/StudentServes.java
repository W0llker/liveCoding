package Aston.zadanie2.serves;

import Aston.zadanie2.entity.Book;
import Aston.zadanie2.entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentServes {
    public static List<Student> initializationListStudent() {
        List<Book> bookList = initializationBooks();
        List<Student> studentList = initializationStudent();
        studentList.get(0).setBookList(bookList.subList(0, 5));
        studentList.get(1).setBookList(bookList.subList(2, 7));
        return studentList;
    }

    private static List<Book> initializationBooks() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/Book"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] result = line.split(",");
                bookList.add(new Book(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    private static List<Student> initializationStudent() {
        List<Student> studentListList = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/Student"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] result = line.split(",");
                studentListList.add(new Student(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentListList;
    }

    public static void processingStudent(List<Student> studentList) {
        studentList.stream().peek(student -> System.out.println("Peek - " + student.toString()))
                .map(Student::getBookList)
                .flatMap(Collection::stream)
                .sorted((b1, b2) -> b1.getPages().compareTo(b2.getPages()))
                .distinct()
                .filter(book -> book.getYearOfPublication() > 2010)
                .limit(3)
                .mapToInt(Book::getYearOfPublication)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Книги нету"));
    }

}
