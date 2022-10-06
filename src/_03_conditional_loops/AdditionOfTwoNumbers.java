package _03_conditional_loops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take two number as input
        System.out.print("Enter the first number: ");
        int first = in.nextInt();

        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        // Addition of two numbers
        int sum = first + second;
        System.out.println("Addition of " + first + " and " + second + " is " + sum);
    }
}
