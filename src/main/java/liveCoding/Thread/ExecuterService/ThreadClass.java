package liveCoding.Thread.ExecuterService;

import liveCoding.Thread.kitchen.ThreadRunnable;
import lombok.SneakyThrows;

import java.util.concurrent.*;


public class ThreadClass {
    @SneakyThrows
    static void main() {
        Executor executor;
        ThreadRunnable th = new ThreadRunnable();

        //испонитель потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CountDownLatch countDownLatch = new CountDownLatch(5);

        executorService.execute(new ThreadPool("A", countDownLatch));
        countDownLatch.await();
        executorService.shutdown();

        //исполнитель потоков с временем
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(th, 10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class ThreadPool extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public ThreadPool(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            countDownLatch.countDown();
            System.out.println(name + " : " + countDownLatch.getCount());
        }
    }
}
