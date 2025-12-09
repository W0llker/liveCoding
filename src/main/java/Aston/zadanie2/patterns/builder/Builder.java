package Aston.zadanie2.patterns.builder;

public interface Builder {
    Builder setName(String name);
    Builder setLastName(String lastName);
    Builder setAge(Integer age);
    Builder setMobilePhone (String mobilePhone);
}
