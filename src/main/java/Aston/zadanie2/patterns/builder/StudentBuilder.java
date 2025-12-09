package Aston.zadanie2.patterns.builder;

public class StudentBuilder implements Builder {
    private String name;
    private String lastName;
    private Integer age;
    private String mobilePhone;

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public Student build() {
        return new Student(name,lastName,age,mobilePhone);
    }
}
