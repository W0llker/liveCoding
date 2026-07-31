package liveCoding.Thread.Semaphore;

import java.util.concurrent.Semaphore;

public class Kitchen implements Runnable {
    private String name;
    private Semaphore semaphore;

    public Kitchen(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " работает с потоком");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("");
        semaphore.release();
    }
}
