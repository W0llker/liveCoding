package liveCoding.Thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinTest {
    static void main() {
        ForkJoinPool pool = new ForkJoinPool();
        double[] mass = new double[100000];

        for (int i = 0; i < 100000; i++) {
            mass[i] = i;
        }

        System.out.println("Исходная последовательность");
        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }

        SqrtTransform sqrtTransform = new SqrtTransform(mass,0,mass.length);
        pool.invoke(sqrtTransform);
        System.out.println("Полученная");
        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }
    }
}

class SqrtTransform extends RecursiveAction {
    final int seq = 1000;
    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start < seq) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}
