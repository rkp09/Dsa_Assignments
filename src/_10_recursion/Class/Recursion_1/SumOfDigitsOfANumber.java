package _10_recursion.Class.Recursion_1;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println(digitsSum(2018));
    }

    public static int digitsSum(int n){
        if (n < 1){
            return 0;
        }

        return (n % 10) + digitsSum(n / 10);
    }
}
