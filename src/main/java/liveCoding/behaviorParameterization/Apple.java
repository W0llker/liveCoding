package liveCoding.behaviorParameterization;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    private Color color;
    private Integer weight;

    public Apple(Color color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if(predicate.test(apple))
                result.add(apple);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
