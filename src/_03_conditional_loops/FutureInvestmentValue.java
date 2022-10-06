package _03_conditional_loops;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for future investment value is
        // = [p * (1 + i)^n](where, p = principal, n = periods, i = percentage)

        // Input principal
        System.out.print("Enter the principal amount: ");
        double p = in.nextDouble();
        // Input percentage
        System.out.print("Enter the percentage: ");
        double i = in.nextDouble();
        // Input periods
        System.out.print("Enter the periods: ");
        int n = in.nextInt();

        // Convert i into percentage
        i /= 100;

        // Calculate future investment value
        double futureInvestment = p * Math.pow((1 + i), n);

        System.out.println("Future investment value after " + n + " years is $" + futureInvestment);
    }
}
