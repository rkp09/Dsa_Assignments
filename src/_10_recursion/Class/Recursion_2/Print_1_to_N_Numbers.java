package _10_recursion.Class.Recursion_2;

public class Print_1_to_N_Numbers {
    public static void main(String[] args) {
        numbersAscDsc(5);
    }

    public static void numbers(int n){
        if (n < 1){
            return;
        }

        numbers(n - 1);

        System.out.println(n);
    }

    public static void numbersAscDsc(int n){
        if (n < 1){
            return;
        }

        System.out.println(n);

        numbersAscDsc(n - 1);

        System.out.println(n);
    }
}
