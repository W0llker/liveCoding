package liveCoding.collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ListExample {
    static void main() {
        List<Integer> list = List.of(new Integer(3));

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        Collection collection;


        Deque<Person> personDeque = new ArrayDeque<>();
        //  personDeque.pop();
        personDeque.push(new Person());

        personDeque.add(new Person());
        personDeque.addFirst(new Person());
        personDeque.addLast(new Person());
        personDeque.remove(new Person());
        System.out.println(personDeque);


        Queue<Person> deque = new ArrayBlockingQueue<>(3); //суть коллекции в том,что ее емкость только из 3человек
        deque.add(new Person());                                                                        // как то так
        deque.add(new Person());                                                                        // как то так
        deque.add(new Person());                                                                        // как то так
        //deque.add(new Person());                  // ошибка упадет

        List linkedlist = new LinkedList();
        linkedlist.add(new Person("Вася", "ФРик", "+375445139012"));
        taskNumberOne();

    }


    private static void taskNumberOne() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.contains("3"));
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
    }
}
