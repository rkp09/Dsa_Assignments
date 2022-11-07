package _10_recursion.Class.Recursion_1;

public class Palindrome {
    public static int reverse(int n){
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

    public static boolean isPalindrome(int n){
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
