package liveCoding.collection;

import java.util.*;

public class HashMapExample {
    static void main() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Hello"); // элемент не добавиться

        for (String string : stringSet) {
            System.out.println(string);
        }
        Set<Person> personSet = new HashSet<>();
        Person person = new Person("Вася", "ФРик", "+375445139012");
        Person person1 = new Person("Вас", "ФРик", "+375445139012");
        Person person2 = new Person("В", "ФРик", "+375445139012");
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        taskNumberOne(personSet);


        Set<String> stringTestTreeSet = new TreeSet<>();
        stringTestTreeSet.add("Hello");
        stringTestTreeSet.add("World");
        stringTestTreeSet.add("123");   //позволяет нам добавлять элементы в определенном порядке
                                        //но нужно реализовать comparable


        //todo HashMap
        Map<String, Person> map = new HashMap<>();
        map.put("Васька",person);
        




    }
    private static void taskNumberOne(Collection<Person> collection) {
        for (Person string : collection) {
            System.out.println(string);
        }
    }
}