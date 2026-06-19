package struktury.LinkList;

public class LinkedList {
    private Link first;
    private Link last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFist(Integer a, Double b) {
        Link link = new Link(a, b);
        if (isEmpty())
            last = link;
        link.setNext(first);
        first = link;
    }
    public void insertLast(Integer a, Double b) {
        Link link = new Link(a,b);
        if(isEmpty())
            first=link;
        else
            last.setNext(link);
        last = link;
    }

    public Link deleteFirst() {
        Link result = first;
        first = first.getNext();
        return result;
    }

    public Link findLink(Integer key) {
        Link result = first;
        while (result != null) {
            if (result.getData().equals(key)) {
                return result;
            } else result = result.getNext();
        }
        return null;
    }

    public Link deleteForKey(Integer key) {
        Link current = first;
        Link prev = first;
        while (!current.getData().equals(key)) {
            if (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            } else return null;
        }
        if (current == first)
            first = first.getNext();
        else prev.setNext(current.getNext());
        return current;
    }

    public void displayList() {
        Link current = first;
        System.out.println("Вывод всего листа");
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
    }
}
