package _01_flow_of_program;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        int a, b, hcf = 0, lcm = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = in.nextInt();
        System.out.print("Enter the second number: ");
        b = in.nextInt();

        // Find the gcd
        for (int i = 1; i <= a; i++){
            if (a % i == 0 && b % i == 0) hcf = i;
        }

        // Find the lcm
        // As we know hcf * lcm = a * b
        lcm = (a * b) / hcf;

        System.out.println("HCF of " + a + ", " + b + " is: " + hcf);
        System.out.println("LCM of " + a + ", " + b + " is: " + lcm);
    }
}
