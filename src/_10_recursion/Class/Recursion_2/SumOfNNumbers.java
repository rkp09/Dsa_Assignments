package _10_recursion.Class.Recursion_2;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(21));
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }

        return n + sum(n - 1);
    }
}
