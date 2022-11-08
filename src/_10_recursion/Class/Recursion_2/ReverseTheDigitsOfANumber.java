package _10_recursion.Class.Recursion_2;

public class ReverseTheDigitsOfANumber {
    public static int reverse1(int currentNumber, int n){
        if (n < 1){
            return currentNumber;
        }

        int newNumber = currentNumber * 10 + (n % 10);
        return reverse1(newNumber, n / 10);
    }


    public static int reverse2(int n){
        if (n == 0)
            return n;

        int length = (int) (Math.log10(n)) + 1;

        return helper(length - 1, n);
    }

    public static int helper(int power, int n) {
        if (n < 1){
            return n;
        }

        int rebuilt = (n % 10) * (int) (Math.pow(10, power));
        return rebuilt + helper(power - 1, n / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse2(4321));
    }
}
