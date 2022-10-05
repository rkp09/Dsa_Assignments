package _03_conditional_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        // Storing the radius value of circle
        double r = in.nextDouble();

        // Formula to calculate the area of circle is
        // area = PI * r^2;
        double area = Math.PI * (r * r);

        System.out.println("Area of circle is " + area);
    }
}
