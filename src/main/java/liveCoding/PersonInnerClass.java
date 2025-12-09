package liveCoding;

public class PersonInnerClass {
    private String name;
    private String surName;

    public PersonInnerClass(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    class InnerPerson {
        public InnerPerson() {

        }
    }
}
