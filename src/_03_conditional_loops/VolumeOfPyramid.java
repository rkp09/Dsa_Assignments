package _03_conditional_loops;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for volume of pyramid is
        // volume = (l * w * h) (l = length, w = width, h = height)

        // Input for the length of pyramid
        System.out.print("Enter the length of pyramid: ");
        double l = in.nextDouble();

        // Input for the width of pyramid
        System.out.print("Enter the width of pyramid: ");
        double w = in.nextDouble();

        // Input for the height of pyramid
        System.out.print("Enter the height of pyramid: ");
        double h = in.nextDouble();

        double volume = (l * w * h) / 3;
        System.out.println("Volume of the pyramid is " + volume);
    }
}
