package liveCoding.reflections;

import lombok.SneakyThrows;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class UnsafeTest {
    @SneakyThrows
    static void main() {
        Person person = new Person();
        //Благодаря этому коду мы можем взаимодействовать с приватными полями
        MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(Person.class, MethodHandles.lookup());
        //Создаем ссылку на конкретное поле name
        VarHandle nameHandler = lookup.findVarHandle(Person.class, "name", String.class);
        nameHandler.set(person, "John");
        //просто получили текущее поле
        System.out.println(nameHandler.get(person));

        //Создаем ссылку на конкретное поле age
        VarHandle ageHandler = lookup.findVarHandle(Person.class, "age", String.class);
        ageHandler.set(person, "30");

        //Обратимся к неприватному полю
        VarHandle surnameHandler = MethodHandles.lookup().findVarHandle(Person.class, "surName", String.class);
        surnameHandler.set(person, "Doe");

        System.out.println(person);
    }
}

class Person {
    private String name;
    private String age;
    public String surName;

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
