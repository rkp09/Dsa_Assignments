package _03_conditional_loops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for perimeter of rectangle is
        // perimeter = 2(l + w) (l = length, w = width)

        // Input for the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double l = in.nextDouble();

        // Input for the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double w = in.nextDouble();

        // Perimeter of rectangle
        double perimeter = 2 * (l + w);

        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
