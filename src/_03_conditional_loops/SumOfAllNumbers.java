package _03_conditional_loops;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        // Input for number
        while(true){
            System.out.print("Enter the number to add to sum or 0 to exit: ");
            int number = in.nextInt();
            if (number == 0) break;
            sum += number;
        }

        System.out.println("Sum of these number is " + sum);
    }
}
