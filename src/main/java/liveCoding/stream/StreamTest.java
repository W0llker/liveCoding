package liveCoding.stream;

import java.util.List;

public class StreamTest {
    static void main() {

        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //filter
//        listNumbers.stream().filter(e -> e > 5).forEach(System.out::println);

        listNumbers.stream().takeWhile(e -> e < 5).forEach(System.out::println);
        listNumbers.stream().dropWhile(e -> e < 5).limit(3).forEach(System.out::println);

        //map() получаем Список названия блюд
        // List<String> dishNames = menu.stream()
        // .map(Dish::getName)
        // .collect(toList())

        System.out.println(listNumbers.stream().reduce(0, (a, b) -> a + b));
        System.out.println(listNumbers.stream().reduce(Integer::min).orElse(0));
    }
}
