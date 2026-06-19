package struktury.Queue;

public class Main {
    static void main() {
        Queue queueCRUD = new Queue(10);
        queueCRUD.insert(3);
        queueCRUD.insert(4);
        queueCRUD.insert(5);
        queueCRUD.insert(6);


        queueCRUD.remove();
        queueCRUD.remove();
        queueCRUD.remove();
        System.out.println("***************************");
        queueCRUD.showAllElement();

        queueCRUD.insert(3);
        queueCRUD.insert(4);
        queueCRUD.insert(5);
        queueCRUD.insert(6);

        queueCRUD.remove();
        queueCRUD.remove();
        queueCRUD.remove();
        System.out.println("***************************");
        queueCRUD.showAllElement();

        queueCRUD.insert(3);
        queueCRUD.insert(4);
        queueCRUD.insert(5);
        queueCRUD.insert(6);


        System.out.println("***************************");
        queueCRUD.showAllElement();


    }
}
