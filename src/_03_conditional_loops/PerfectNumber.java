package _03_conditional_loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //Perfect numbers are equal to the sum of their proper divisors.
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        long n = in.nextLong();

        // Divisors sum
        long sum = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        if(n == sum)
            System.out.println(n + " is a perfect number.");
        else
            System.out.println(n + " is not a perfect number.");
    }
}
