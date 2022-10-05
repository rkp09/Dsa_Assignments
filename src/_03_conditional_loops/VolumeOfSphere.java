package _03_conditional_loops;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for volume of sphere is
        // volume = 4 / 3 * PI * r^3 (r = radius)

        // Input for the base area of cylinder
        System.out.print("Enter the radius of sphere: ");
        double r = in.nextDouble();

        double volume = (4 / 3.0) * Math.PI * (r * r * r);
        System.out.println("Volume of the sphere is " + volume);
    }
}
