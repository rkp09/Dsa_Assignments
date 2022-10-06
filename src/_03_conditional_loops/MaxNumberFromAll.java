package _03_conditional_loops;

import java.util.Scanner;

public class MaxNumberFromAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        // Input for number
        while(true){
            System.out.print("Enter a number or 0 to exit: ");
            int number = in.nextInt();
            if (number == 0) break;
            if (number > max) max = number;
        }

        System.out.println("Maximum number from these number is " + max);
    }
}
