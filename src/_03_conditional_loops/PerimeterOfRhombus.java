package _03_conditional_loops;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for perimeter of rhombus is
        // perimeter = 2 * a (a = side length)

        // Input for the length of the rhombus
        System.out.print("Enter the side length of the rhombus: ");
        double a = in.nextDouble();

        // Perimeter of rhombus
        double perimeter = 4 * a;

        System.out.println("Perimeter of rhombus is " + perimeter);
    }
}
