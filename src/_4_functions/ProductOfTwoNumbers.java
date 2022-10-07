package _4_functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two number
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        System.out.println("Sum of " + first + " and " + second + " is " + product(first, second));
    }

    public static int product(int a, int b){
        return a * b;
    }
}
