package liveCoding.OOP;

public class Car extends Transport {
    private Integer speed;

    public Car(Integer speed, String model, String name) {
        super(name, model);
        this .speed = speed;
    }
}
