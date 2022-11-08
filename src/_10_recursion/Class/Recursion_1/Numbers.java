package _10_recursion.Class.Recursion_1;

public class Numbers {
    public static void main(String[] args) {
        numbers(1);
    }

    public static void numbers(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n + 1);
    }
}
