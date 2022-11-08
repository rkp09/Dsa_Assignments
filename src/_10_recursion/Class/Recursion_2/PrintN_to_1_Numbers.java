package _10_recursion.Class.Recursion_2;

public class PrintN_to_1_Numbers {
    public static void main(String[] args) {
        numbers(5);
    }

    public static void numbers(int n){
        // Base case
        if (n < 1)
            return;

        System.out.println(n);
        numbers(n - 1);
    }
}
