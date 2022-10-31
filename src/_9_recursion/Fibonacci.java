package _9_recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibonacci(5);
        System.out.println(ans);
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
