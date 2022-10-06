package _03_conditional_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the nth number to get all the number up to nth
        System.out.print("Enter the nth number to get the full series up to nth : ");
        int N = in.nextInt();

        // Edge cases
        if (N == 0){
            System.out.print("Series: " + 0 + " ");
            System.exit(0);
        }

        // first two numbers of fibonacci series
        int previous = 0;
        int current = 1;

        System.out.print("Series: ");
        System.out.print(previous + " ");
        System.out.print(current + " ");

        // i = 2 because we previously printed two element
        for(int i = 2; i < N; i++){
            // Formula for achieve this:
            // Store the current value to previous.
            // Add previous value to current and this will be the next value
            int temp = current;
            current += previous;
            previous = temp;

            // print the number
            System.out.print(current + " ");
        }
    }
}
