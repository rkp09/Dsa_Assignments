package _03_conditional_loops;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Storing the sum of all numbers
        int sum = 0;

        // Storing how many number has already add up
        int N = 0;

        while(true){
            System.out.print("Enter a number or 'q' to quit the program: ");
            String input = in.next();
            if (input.equals("q") || input.equals("Q")) break;

            int number = Integer.parseInt(input);
            sum += number;
            N++;
        }

        double average = sum / (double) N;

        System.out.println("Average of these number is " + average);
    }
}
