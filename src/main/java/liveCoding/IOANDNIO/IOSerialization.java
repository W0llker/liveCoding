package liveCoding.IOANDNIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOSerialization {
    static void main() {
        serializePerson(new IOSerialization().createPerson());
        System.out.println(deserializePerson());
    }

    static void serializePerson(Person person) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/person.ser"))) {
            objectOutputStream.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static Person deserializePerson() {
        Person person = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/person.ser"))) {
            person = (Person) objectInputStream.readObject();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }
    public Person createPerson() {
        return new Person("Васька", "Пупыч", "2321", 12);
    }
}
