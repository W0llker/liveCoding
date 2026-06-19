package liveCoding.Thread.kitchen;

import lombok.SneakyThrows;

// или extends Thread
public class TeaTools extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(10);
        System.out.println("Чай будет готов через 5 минут");
    }
}
