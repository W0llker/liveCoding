package struktury.LinkList.doubleLink;

public class Link {
    public Long key;
    public Link next;
    public Link prev;

    public Link(Long key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Link{" +
                "key=" + key +
                '}';
    }
}
