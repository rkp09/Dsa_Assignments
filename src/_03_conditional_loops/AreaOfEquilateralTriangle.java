package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for equilateral triangle area is
        // area = sqrt(3) / 4 * a^2 (a = side)

        // Input for side length of triangle
        System.out.print("Enter the side length of equilateral triangle: ");
        double a = in.nextDouble();

        // Area of equilateral triangle
        double area = (Math.sqrt(a) / 4) * (a * a);

        System.out.println("Area of equilateral triangle is " + area);
    }
}
