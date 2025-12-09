package Aston.zadanie2.patterns.adapter;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Что то ест!");
    }
}
