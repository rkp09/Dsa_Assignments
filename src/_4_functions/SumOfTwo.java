package _4_functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.iimport java.sql.SQLOutput;n);

        // Input two number
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        System.out.println("Sum of " + first + " and " + second + " is " + sum(first, second));
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
