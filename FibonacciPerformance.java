public class FibonacciPerformance {
    public static void main(String[] args) {
        System.out.println("Fibonacci Performance Test");

        long startTime = System.nanoTime();
        fibonacciRecursive(30);
        long time1 = System.nanoTime() - startTime;
        System.out.println("Time taken using Recursive Fibonacci: " + time1 + " ns");

        startTime = System.nanoTime();
        fibonacciIterative(30);
        long time2 = System.nanoTime() - startTime;
        System.out.println("Time taken using Iterative Fibonacci: " + time2 + " ns");
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
//output
// Fibonacci Performance Test
//Time taken using Recursive Fibonacci: 3926900 ns
//Time taken using Iterative Fibonacci: 2000 ns
