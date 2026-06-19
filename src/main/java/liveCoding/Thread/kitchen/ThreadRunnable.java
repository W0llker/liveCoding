package liveCoding.Thread.kitchen;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("поток через интерфейс runnable");
    }
}
