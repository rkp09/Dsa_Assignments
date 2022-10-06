package _03_conditional_loops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for compound interest is
        // = [p * (1 + i)^n] - p (where, p = principal, n = periods, i = percentage)

        // Input principal
        System.out.print("Enter the principal amount: ");
        double p = in.nextDouble();
        // Input principal
        System.out.print("Enter the percentage: ");
        double i = in.nextDouble();
        // Input principal
        System.out.print("Enter the periods: ");
        int n = in.nextInt();

        // Convert i into percentage
        i /= 100;

        // Calculate compound interest
        double compoundInterest = p * Math.pow((1 + i), n) - p;

        System.out.println("Compound interest after " + n + " years is $" + compoundInterest);
    }
}
