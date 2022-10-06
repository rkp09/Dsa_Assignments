package _03_conditional_loops;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for usage current, meter bill, cost of per unit
        System.out.print("Enter the meter bill: ");
        double meterBill = in.nextDouble();

        System.out.print("Enter the usage current: ");
        double usageCurrent = in.nextDouble();

        System.out.print("Enter the cost of per unit: ");
        double costOfPerUnit = in.nextDouble();

        double netBill = calculate(usageCurrent, meterBill, costOfPerUnit);

        System.out.println("Net electricity bill is " + netBill + " BDT.");
    }

    public static double calculate(double usageCurrent, double meterBill, double costOfPerUnit){
        return (usageCurrent * costOfPerUnit) + meterBill;
    }
}
