package liveCoding.IOANDNIO;

import java.io.Externalizable;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surName;
    private String phone;
    //это поле не сохраниться при сериализации
    private transient String address;
    private int age;

    public Person(String name, String surName, String phone, int age) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
