package _01_flow_of_program;

import java.util.Scanner;

public class SumOfBoth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number: ");
        a = in.nextInt();
        System.out.print("Enter the second number: ");
        b = in.nextInt();

        System.out.println("Sum of both : " + (a + b));
    }
}
