package Aston.TestZadanie;

public class Massive {
    static void main() {
        int[][] massive = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                massive[i][j] = (int) (10 * Math.random());
            }
        }
        min(massive);
    }

    private static int min(int[][] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 4 - i; true; ) {
                if (min > mass[i][j]) {
                    min = mass[i][j];
                }
                break;
            }
        }
        System.out.println(min);
        return min;
    }
}
