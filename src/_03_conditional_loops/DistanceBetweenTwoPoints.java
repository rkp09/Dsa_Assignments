package _03_conditional_loops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the first point position
        System.out.print("Enter the first point position in meter: ");
        double first = in.nextDouble();
        //Input the second point position
        System.out.print("Enter the second point position in meter: ");
        double second = in.nextDouble();

        // Calculate the distance between two points
        double distance = second - first;

        System.out.println("Distance between first and second point is " + distance);
    }
}
