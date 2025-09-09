package Submissionofalgo;
public class FibonacciDemo {

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        System.out.println("Recursive Fibonacci(" + n + "): " + fibonacciRecursive(n));
        long end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        System.out.println("Iterative Fibonacci(" + n + "): " + fibonacciIterative(n));
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start)/1e6 + " ms");
    }
}


