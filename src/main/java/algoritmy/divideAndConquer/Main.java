package algoritmy.divideAndConquer;

import java.util.Arrays;

public class Main {
    static void main() {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
        System.out.println(max(new int[]{1, 2, 3, -5, 1, 9, 3, -5}));
    }

    public static int sum(int[] summ) {
        if (summ.length == 1)
            return summ[0];
        return summ[0] + sum(Arrays.copyOfRange(summ, 1, summ.length));
    }

    public static int max(int[] summ) {
        int maxNumber = 0;
        if (summ.length == 1)
            return summ[0];
        maxNumber = max(Arrays.copyOfRange(summ, 1, summ.length));
        if (summ[0] > maxNumber)
            maxNumber = summ[0];
        return maxNumber;
    }
}
