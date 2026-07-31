package liveCoding.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    static void main() {
        ReentrantLock lock = new ReentrantLock();

        new ThreadReentrantLock("A", lock).start();
        new ThreadReentrantLock("B", lock).start();
    }
}

class SharedCount {
    public static int Shared = 0;
}

class ThreadReentrantLock extends Thread {
    private ReentrantLock lock = new ReentrantLock();
    private String name;

    public ThreadReentrantLock(String name, ReentrantLock lock) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " Ждет");
        lock.lock();
        SharedCount.Shared++;
        System.out.println(name + " Работает:Shared=" + SharedCount.Shared);
        System.out.println(name + " Закончил работу");
        lock.unlock();

    }
}
