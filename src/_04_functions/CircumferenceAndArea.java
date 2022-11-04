package _04_functions;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the radius of circle
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();

        System.out.println("Circumference of circle is " + circumference(r));
        System.out.println("Area of circle is " + area(r));
    }

    public static double circumference(double r){
        return 2 * Math.PI * r;
    }

    public static double area(double r){
        return Math.PI * (r * r);
    }
}
