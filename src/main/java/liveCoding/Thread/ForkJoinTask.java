package liveCoding.Thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask {
    static void main() {
        ForkJoinPool pool = ForkJoinPool.commonPool();

        double[] data = new double[5000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (((i % 2) == 0) ? i : -i);
        }

        SqlTask sum = new SqlTask(data,0,data.length);
        double summes = pool.invoke(sum);
        System.out.println("summes = " + summes);
    }
}

class SqlTask extends RecursiveTask<Double> {
    final int sql = 500;
    double[] data;
    int start;
    int end;

    public SqlTask(double[] date, int start, int end) {
        this.data = date;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if (end - start < sql) {
            for (int i = start; i < end; i++)
                sum += data[i];
        } else {
            int middle = (start + end) / 2;
            SqlTask left = new SqlTask(data, start, middle);
            SqlTask right = new SqlTask(data, middle, end);

            left.fork();
            right.fork();
            sum = left.join() + right.join();
        }
        return sum;
    }
}
