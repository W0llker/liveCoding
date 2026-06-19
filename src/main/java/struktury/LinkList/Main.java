package struktury.LinkList;

public class Main {
    static void main() {
        LinkedList list = new LinkedList();
        list.insertFist(5,4.3);
        list.insertFist(3,2.1);
        list.insertFist(1,1.3);
        list.insertFist(6,2.7);
        System.out.println(list.findLink(7));
        System.out.println(list.deleteForKey(1));
        list.displayList();
    }
}
