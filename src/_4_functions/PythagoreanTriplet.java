package _4_functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Formula for pythagorean triplet is
        // a^2 + b^2 = c^2 (where, a = perpendicular,
        // b = base, c = hypotenuse

        // Input perpendicular
        System.out.print("Enter the perpendicular (a) of triplet: ");
        int a = in.nextInt();

        // Input base
        System.out.print("Enter the base (b) of triplet: ");
        int b = in.nextInt();

        // Input hypotenuse
        System.out.print("Enter the hypotenuse (c) of triplet: ");
        int c = in.nextInt();

        if(isPythagorean(a, b, c))
            System.out.println("It is a Pythagorean triplet.");
        else
            System.out.println("It is not a Pythagorean triplet.");

    }

    public static boolean isPythagorean(int a, int b, int c){
        // calculate a^2 + b^2
        int abSquare = (a * a) + (b * b);
        return abSquare == (c * c);
    }
}
