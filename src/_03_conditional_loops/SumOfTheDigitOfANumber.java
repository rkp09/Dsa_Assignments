package _03_conditional_loops;

import java.util.Scanner;

public class SumOfTheDigitOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        long n = in.nextLong();

        long digitsSum = sumOfTheDigit(n);
        System.out.println("Sum of the digits of " + n + " is " + digitsSum);
    }

    public static long sumOfTheDigit(long n){
        // Sum of the digits
        long sum = 0;

        while(n > 0){
            int digit = (int) n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
