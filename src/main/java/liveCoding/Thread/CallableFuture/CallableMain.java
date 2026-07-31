package liveCoding.Thread.CallableFuture;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class CallableMain {
    static void main() throws ExecutionException, InterruptedException, TimeoutException {
        //
        Parallelepiped parallelepiped = new Parallelepiped(4, 3, 6);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> parallelepipedFuture = executorService.submit(parallelepiped);
        System.out.println(parallelepipedFuture.get());


        //2 метод для того что бы польззователь не ждал вечность
        System.out.println(parallelepipedFuture.get(1,TimeUnit.MINUTES));
        executorService.shutdown();
    }
}
