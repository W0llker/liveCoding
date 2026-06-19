package struktury.PriorityQueue;

public class Main {
    static void main() {
        PrioriQueue prioriQueue = new PriorityQueue(10);

        prioriQueue.insert(1);
        prioriQueue.insert(3);
        prioriQueue.insert(2);
        prioriQueue.insert(5);

        System.out.println(prioriQueue.remove());
    }
}
