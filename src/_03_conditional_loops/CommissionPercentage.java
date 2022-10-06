package _03_conditional_loops;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the price and commission
        System.out.print("Enter the price: ");
        double price = in.nextDouble();
        System.out.print("Enter the commission percentage: ");
        double comPercentage = in.nextDouble();

        // Calculate commission
        double commission = price * (comPercentage / 100);

        System.out.println("After " + comPercentage +"% off commission is $" + commission);
    }
}
