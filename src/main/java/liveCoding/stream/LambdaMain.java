package liveCoding.stream;

import liveCoding.behaviorParameterization.Apple;
import liveCoding.behaviorParameterization.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class LambdaMain {
    static void main() {
        Number number = () -> 15;
        System.out.println(number);
        Apple apple = new Apple(Color.GREEN,255);
        List<Apple> apples = Arrays.asList(apple,apple,apple);
        //todo вариант с анонимным классом
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        //todo варинат лямбды
        apples.sort(comparing(applee -> applee.getWeight()));
        //todo варинат с использованием ссылки
        apples.sort(comparing(Apple::getWeight));

    }
}

interface Number {
    int getNumber();
}
