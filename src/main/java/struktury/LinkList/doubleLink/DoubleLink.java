package struktury.LinkList.doubleLink;

public class DoubleLink {
    private Link first;
    private Link last;

    public DoubleLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Long element) {
        Link newLink = new Link(element);
        if (isEmpty())
            last = newLink;
        else
            first.prev = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(Long element) {
        Link newLink = new Link(element);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        newLink.prev = last;
        last = newLink;
    }

    //не буду указывать удаление первого и последнего элемента они дефолтные

    public Link deleteKey(Long element) {
        Link current = first;
        while (current.key != element) {
            current = current.next;
            if (current == null)
                return null;
        }

        if (current == first)
            first = current.next;
        else
            current.prev.next = current.next;

        if (current == last)
            last = current.prev;
        else
            current.next.prev = current.prev;

        return current;
    }
}
