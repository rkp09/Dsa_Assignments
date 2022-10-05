package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for calculating rhombus area is
        // area = (largest diagonal (p) * smallest diagonal (q)) / 2

        // Input for the largest diagonal of rhombus
        System.out.print("Enter the largest diagonal of rhombus: ");
        double p = in.nextDouble();

        //Input for the smallest diagonal of rhombus
        System.out.print("Enter the smallest diagonal of rhombus: ");
        double q = in.nextDouble();

        // Area of rhombus
        double area = (p * q) / 2;

        System.out.println("Area of rhombus is " + area);
    }
}
