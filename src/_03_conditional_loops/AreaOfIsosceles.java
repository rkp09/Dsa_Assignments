package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for calculate area of isosceles triangle is
        // area = 1/2 * base * height
        // Input for base
        System.out.print("Enter the base of triangle: ");
        double base = in.nextDouble();

        // Input for height
        System.out.print("Enter the height of triangle: ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of isosceles triangle is " + area);
    }
}
