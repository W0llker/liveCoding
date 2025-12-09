package Aston.zadanie2.patterns.adapter;

public class AdapterRobot implements Robot{
    Animal animal;

    public AdapterRobot(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        animal.eat();
    }
}
