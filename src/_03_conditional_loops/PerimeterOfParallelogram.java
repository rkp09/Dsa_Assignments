package _03_conditional_loops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for perimeter of parallelogram is
        // perimeter = 2(a + b) (a = side length, b = base)

        // Input for the base of the parallelogram
        System.out.print("Enter the base of the parallelogram: ");
        double a = in.nextDouble();

        // Input for the side length of the parallelogram
        System.out.print("Enter the side length of the parallelogram: ");
        double b = in.nextDouble();

        // Perimeter of parallelogram
        double perimeter = 2 * (a + b);

        System.out.println("Perimeter of parallelogram is " + perimeter);
    }
}
