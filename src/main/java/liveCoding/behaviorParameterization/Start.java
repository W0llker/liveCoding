package liveCoding.behaviorParameterization;

import java.util.List;

public class Start {
    static void main(String[] args) {
        Apple apple = new Apple(Color.GREEN, 144);

        System.out.println(Apple.filterApple(List.of(apple), new FilterAppleColor()));

        System.out.println(Apple.filterApple(List.of(apple), apple1 -> apple1.getWeight() > 145));

        System.out.println(Apple.filterApple(List.of(apple),apple1 -> apple1.getWeight() < 120));

    }
}
