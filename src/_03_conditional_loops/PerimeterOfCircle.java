package _03_conditional_loops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for perimeter of circle is
        // perimeter = 2 * PI * r (radius)

        // Input for the radius of circle
        System.out.print("Enter the radius of circle: ");
        double r = in.nextDouble();

        double perimeter = 2 * Math.PI * r;

        System.out.println("Perimeter of circle is " + perimeter);
    }
}
