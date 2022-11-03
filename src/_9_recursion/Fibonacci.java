package _9_recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboNumber(50));
    }

    // Find the nth fibonacci number in fibonacci series
    // This formula is found when analysis time complexity
    // And the golden ratio of time complexity of nth number
    // of fibonacci series is O(1.618^n)
    public static int fiboNumber(int n){
        return (int) ((1 / Math.sqrt(5)) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)));
    }

    // The argument going to be nth position of fibonacci series
    public static int fibonacci(int n){
        // Base condition
        if (n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
