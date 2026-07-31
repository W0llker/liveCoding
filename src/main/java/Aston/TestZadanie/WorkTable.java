package Aston.TestZadanie;

import java.util.*;

public class WorkTable {
    static void main() {
        List<Map<String, String>> list = new ArrayList<>();
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Максим/32/Middle Java/$1200"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Иван/25/Junior java dev/50000 ₽"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Мария/35/Senior java automation QA/160000 ₽"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Петр/28/Dev-ops/$ 1700"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Анна/31/Middle functional tester/€ 1100"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Кирил/36/Senior java dev/€ 2500"));
        list.add(inizializationMap("Имя/Возраст/Должность/Зарплата", "Дмитрий/22/Junior java automation QA/45000 ₽"));
        System.out.println(list);
        System.out.println("Средний возраст сотрудников = " + avgAge(list));
        List<Person> personList = createPersonList(list);
        System.out.println("Возраст меньше 30");
        infoPerson(personList);
        System.out.println("Зпка в рублях");
        infoSalaryRub(personList);
    }

    private static List<Person> createPersonList(List<Map<String, String>> list) {
        List<Person> personList = new ArrayList<>();
        for (Map<String, String> map : list) {
            personList.add(new Person(map.get("Имя"), Integer.parseInt(map.get("Возраст")), map.get("Должгость"), map.get("Зарплата")));
        }
        return personList;
    }

    private static void infoSalaryRub(List<Person> personList) {
        personList.stream().filter(person -> person.getSalary().length() > 6).forEach(System.out::println);
    }

    private static void infoPerson(List<Person> personList) {
        personList.stream()
                .filter(person -> person.getAge() < 30)
                .forEach(System.out::println);
    }

    private static double avgAge(List<Map<String, String>> list) {
        return list.stream()
                .map(map -> map.get("Возраст")).mapToInt(Integer::valueOf).average().getAsDouble();
    }

    private static HashMap<String, String> inizializationMap(String key, String value) {
        HashMap<String, String> map = new HashMap<>();
        String[] keys = key.split("/"), values = value.split("/");
        for (int i = 0; i < 4; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
}
