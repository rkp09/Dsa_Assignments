package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Formula for area of rectangle is
        // area = length * width

        // Input for length
        System.out.print("Enter the length of rectangle: ");
        double length = in.nextDouble();

        // Input for width
        System.out.print("Enter the width of rectangle: ");
        double width = in.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle is " + area);
    }
}
