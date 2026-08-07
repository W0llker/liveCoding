package liveCoding.stream.task;

public class Trader {
    private final String name;
    private final String cite;

    public Trader(String name,String cite) {
        this.cite = cite;
        this.name = name;
    }

    public String getCite() {
        return cite;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "cite='" + cite + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
