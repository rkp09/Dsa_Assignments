package _03_conditional_loops;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for volume of prism is
        // volume = b * h (b = base area, h = height)

        // Input for the base area of prism
        System.out.print("Enter the base area of prism: ");
        double b = in.nextDouble();

        // Input for the height of prism
        System.out.print("Enter the height of prism: ");
        double h = in.nextDouble();

        double volume = b * h;
        System.out.println("Volume of the prism is " + volume);
    }
}
