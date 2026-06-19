package liveCoding.Thread;

import liveCoding.Thread.kitchen.TeaTools;
import liveCoding.Thread.kitchen.ThreadRunnable;

public class ThreadTest {
    static void main() throws InterruptedException {
//        Thread
        TeaTools teaTools = new TeaTools();
//        teaTools.start();
//      Runnable
        Thread t1 = new Thread(new ThreadRunnable());
//        t1.start();

        showJoin(teaTools,new ThreadRunnable());
//        Thread current = Thread.currentThread();
//        System.out.println(current.getName());
//        System.out.println(current.getState());
    }

    static void showJoin(TeaTools teaTools,ThreadRunnable threadRunnable) throws InterruptedException {
        teaTools.start();
        Thread thread = new Thread(threadRunnable);
        //забирает весь ресурс и не позвоялет другим потокам работать пока что сам не выполнит свою задачу
        teaTools.join();
        thread.start();
    }
}
