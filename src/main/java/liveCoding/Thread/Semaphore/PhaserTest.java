package liveCoding.Thread.Semaphore;

import lombok.SneakyThrows;

import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

public class PhaserTest {
    static void main() {
        Phaser phaser = new Phaser(1);
        int phase;

        new ThreadPhaser("A", phaser).start();
        new ThreadPhaser("B", phaser).start();
        new ThreadPhaser("C", phaser).start();

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(phase + " фаза закончена");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(phase + " фаза закончена");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(phase + " фаза закончена");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated())
            System.out.println("Пока");
    }
}

class ThreadPhaser extends Thread {
    private String name;
    private Phaser phaser;

    public ThreadPhaser(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
        phaser.register();
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(name + " начал первую фазу");
        phaser.arriveAndAwaitAdvance();
        Thread.sleep(10);

        System.out.println(name + " начал 2 фазу");
        phaser.arriveAndAwaitAdvance();
        Thread.sleep(10);

        System.out.println(name + " начал 3 фазу");
        phaser.arriveAndDeregister();
    }
}
