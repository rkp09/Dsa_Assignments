package _03_conditional_loops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for volume of cone is
        // volume = PI * r^2 * h / 3 (r = radius, h = height)

        // Input for radius of cone
        System.out.print("Enter the radius of cone: ");
        double r = in.nextDouble();

        // Input for height of cone
        System.out.print("Enter the height of cone: ");
        double h = in.nextDouble();

        double volume = Math.PI * (r * r) * h / 3;

        System.out.println("Volume of the cone is " + volume);
    }
}
