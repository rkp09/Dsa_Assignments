package _03_conditional_loops;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the depreciation cost and lifespan of asset's
        System.out.print("Enter the depreciation cost: ");
        int cost = in.nextInt();
        System.out.print("Enter the lifespan of asset's: ");
        int lifespan = in.nextInt();

        // Calculate depreciation value
        double value = (double) cost / lifespan;

        System.out.println("Depreciation value is " + value);
    }
}
