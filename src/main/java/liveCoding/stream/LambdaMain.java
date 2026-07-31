package liveCoding.stream;

public class LambdaMain {
    static void main() {
        Number number = () -> 15;
        System.out.println(number);


    }
}

interface Number {
    int getNumber();
}
