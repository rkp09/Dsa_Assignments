package _03_conditional_loops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for perimeter of equilateral triangle is
        // perimeter = 3 * a (a = side length)

        // Input for the side length of equilateral triangle
        System.out.print("Enter the side length of equilateral triangle: ");
        double a = in.nextDouble();

        // Perimeter of equilateral triangle
        double perimeter = 3 * a;

        System.out.println("Perimeter of equilateral triangle is " + perimeter);
    }
}
