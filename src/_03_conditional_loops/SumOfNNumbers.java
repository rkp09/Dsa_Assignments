package _03_conditional_loops;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Storing the sum of all numbers
        double sum = 0;
        while(true){
            System.out.print("Enter a number or 'q' to quit the program: ");
            String input = in.next();
            if (input.equals("q") || input.equals("Q")) break;
            sum += Double.parseDouble(input);
        }

        System.out.println("Sum of these number is " + sum);
    }
}
