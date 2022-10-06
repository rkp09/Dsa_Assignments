package _03_conditional_loops;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for curved surface area of cylinder is
        // area = 2 * PI * r * h (r = radius, h = height)

        // Input for the radius of cylinder
        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();

        // Input for the height of cylinder
        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();

        // Calculating the curved surface area of cylinder
        double area = 2 * Math.PI * r * h;

        System.out.println("Curved surface area of cylinder is " + area);
    }
}
