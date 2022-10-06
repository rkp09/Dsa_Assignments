package _03_conditional_loops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for total surface area of cube is
        // area = 6 * a^2 (a = length )

        // Input for any face length
        System.out.print("Enter any face length of cube: ");
        double a = in.nextDouble();

        // Calculating the total surface area of cube
        double area = 6 * (a * a);

        System.out.println("Total surface area of cube is " + area);
    }
}
