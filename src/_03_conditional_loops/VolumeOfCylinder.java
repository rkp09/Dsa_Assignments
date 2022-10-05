package _03_conditional_loops;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for volume of cylinder is
        // volume = PI * r^2 * h (r = radius, h = height)

        // Input for the base area of cylinder
        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();

        // Input for the height of cylinder
        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();

        double volume = Math.PI * (r * r) * h;
        System.out.println("Volume of the cylinder is " + volume);
    }
}
