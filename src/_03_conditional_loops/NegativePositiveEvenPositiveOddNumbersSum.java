package _03_conditional_loops;

import java.util.Scanner;

public class NegativePositiveEvenPositiveOddNumbersSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Sum of negative numbers
        double sumOfNeg = 0;
        // Sum of positive even numbers
        double sumOfPosEven = 0;
        // Sum of positive odd numbers
        double sumOfPosOdd = 0;

        while(true){
            // Input for number
            System.out.print("Enter positive even, positive odd and negative or 0 to exit: ");
            double number = in.nextDouble();
            if (number == 0) break;
            if(number < 0) sumOfNeg += number;
            if(number % 2 == 0)
                sumOfPosEven += number;
            else
                sumOfPosOdd += number;
        }

        System.out.println("Sum of negative numbers is " + sumOfNeg);
        System.out.println("Sum of positive even numbers is " + sumOfPosEven);
        System.out.println("Sum of positive odd numbers is " + sumOfPosOdd);
    }
}
