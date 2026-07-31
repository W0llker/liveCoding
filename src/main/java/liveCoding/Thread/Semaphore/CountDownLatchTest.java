package liveCoding.Thread.Semaphore;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class CountDownLatchTest {
    @SneakyThrows
    static void main() {
      CountDownLatch countDownLatch = new CountDownLatch(5);
      new Thread(new CountThread(countDownLatch)).start();
      countDownLatch.await();
      System.out.println("ПОКА");
    }
}
class CountThread implements Runnable {
    private CountDownLatch countDownLatch;

    public CountThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            countDownLatch.countDown();
            System.out.println("Ждемс");
            Thread.sleep(100);
        }
    }
}

