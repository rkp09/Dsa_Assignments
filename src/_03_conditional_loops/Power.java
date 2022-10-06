package _03_conditional_loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the base and power
        System.out.print("Enter the base number: ");
        double base = in.nextDouble();
        System.out.print("Enter the power: ");
        double power = in.nextDouble();

        System.out.println(base + " raised to the power " + power + " is " + pow(base, power));
    }

    public static double pow(double base, double power){
        double result = 1;

        for (int i = 0; i < power; i++){
            result *= base;
        }

        return result;
    }
}
