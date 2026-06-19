package liveCoding.generic;

public class Main {
    static void main() {
        TestGeneric<String> stringTestGeneric = new TestGeneric<>("Никита", "Вдовенков");
        stringTestGeneric.informationGeneric();
    }
}

class TestGeneric<T extends String> {
    private T name;
    private T surName;

    public TestGeneric(T name, T surName) {
        this.name = name;
        this.surName = surName;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSurName() {
        return surName;
    }

    public void setSurName(T surName) {
        this.surName = surName;
    }

    public void informationGeneric() {
        System.out.println(name.toString() + " " + surName.toString());
    }
}
