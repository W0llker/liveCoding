package liveCoding.Thread.Semaphore;

import lombok.SneakyThrows;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    static void main() {
        Exchanger<String> exchanger = new Exchanger<>();
        new ThreadA(exchanger).start();
        new ThreadB(exchanger).start();

    }
}

class ThreadA extends Thread {
    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    @SneakyThrows
    public void run() {
        String string = "";
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                string += (char) ch++;
            string = exchanger.exchange(new String());
        }
    }
}

class ThreadB extends Thread {
    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    @SneakyThrows
    public void run() {
        String string = "";
        for (int i = 0; i < 3; i++) {
            string = exchanger.exchange(string);
            System.out.println("Получено: " + string);
        }
    }
}
