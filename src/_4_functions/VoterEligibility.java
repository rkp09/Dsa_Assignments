package _4_functions;

import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the voter name and age
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (isEligible(age)) {
            System.out.println(name + " is eligible for vote.");
        }else {
            System.out.println(name + " is not eligible for vote.");
        }
    }

    public static boolean isEligible(int age){
        return age >= 18;
    }
}
