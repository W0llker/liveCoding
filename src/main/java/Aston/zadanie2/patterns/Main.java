package Aston.zadanie2.patterns;

import Aston.zadanie2.patterns.builder.Student;
import Aston.zadanie2.patterns.adapter.AdapterRobot;
import Aston.zadanie2.patterns.adapter.Animal;
import Aston.zadanie2.patterns.adapter.Cat;
import Aston.zadanie2.patterns.builder.StudentBuilder;


public class Main {
    public static void main(String[] args) {
        /// TODO: 28.11.2025 Builder
        Student student = new StudentBuilder().setAge(22)
                .setLastName("Серега")
                .setName("ММММ")
                .setMobilePhone("+37541414")
                .build();
        System.out.println(student);

        // TODO: 28.11.2025 Adapter
        Animal animal = new Cat();
        animal.eat();

        AdapterRobot robot = new AdapterRobot(animal);
        robot.eat();
    }
}
