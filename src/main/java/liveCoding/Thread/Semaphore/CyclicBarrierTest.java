package liveCoding.Thread.Semaphore;

import lombok.SneakyThrows;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    static void main() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("Барьер достигнут");
            }
        });
        new Thread(new Barrier(cyclicBarrier,"A")).start();
        new Thread(new Barrier(cyclicBarrier,"B")).start();

    }
}
class Barrier implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private String name;

    public Barrier(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(name);
        cyclicBarrier.await();
    }
}
