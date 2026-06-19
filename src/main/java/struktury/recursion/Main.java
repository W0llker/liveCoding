package struktury.recursion;

public class Main {
    static void main() {
        System.out.println(new Main().factorial(5));

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(new Main().find(9, 0, a.length, a));
    }

    //todo пример рекурсии
    public int factorial(int n) {
        if (n == 0) //базовое ограничение рекурсии
            return 1;
        return n * factorial(n - 1);
    }

    //todo рекурсивный двоичный поиск
    public int find(int key, int uplow, int updown, int[] a) {
        int current = (uplow + updown) / 2;
        if (a[current] == key)
            return current;
        else if (uplow > updown)
            return -1;
        else {
            if (a[current] < key)
                return find(key, current + 1, updown, a);
            else
                return find(key, uplow, current - 1, a);
        }
    }
}
