public class Fibo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
