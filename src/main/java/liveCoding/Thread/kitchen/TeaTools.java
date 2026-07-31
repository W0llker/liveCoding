package liveCoding.Thread.kitchen;



// или extends Thread
public class TeaTools extends Thread {

    @Override
    public void run() {
//        Thread.sleep(10);
        System.out.println("Чай будет готов через 5 минут");
    }
}
