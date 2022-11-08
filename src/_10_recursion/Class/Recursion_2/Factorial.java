package _10_recursion.Class.Recursion_2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        // We know, 0! = 1, 1! = 1;
        if (n < 2){
            return 1;
        }

        return n * fact(n - 1);
    }
}
