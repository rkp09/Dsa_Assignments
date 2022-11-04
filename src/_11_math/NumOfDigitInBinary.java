package _11_math;

public class NumOfDigitInBinary {
    public static void main(String[] args) {
        System.out.println(digit(21));
    }

    public static int digit(int n) {
        return (int) (Math.log(n) / Math.log(2)) + 1;
    }
}
