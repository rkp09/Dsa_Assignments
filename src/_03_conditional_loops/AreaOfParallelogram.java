package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for area of parallelogram is
        // area = base * height;

        // Input for base
        System.out.print("Enter the base of parallelogram: ");
        double base = in.nextDouble();

        // Input for height
        System.out.print("Enter the height of the parallelogram: ");
        double height = in.nextDouble();

        double area = base * height;

        System.out.println("Area of parallelogram is " + area);
    }
}
