package liveCoding.Thread.Semaphore;

import java.util.concurrent.Semaphore;

public class DefaultSemaphore {
    public static int count = 0;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new Kitchen("A", semaphore)).start();
        new Thread(new Kitchen("B", semaphore)).start();
    }
}
