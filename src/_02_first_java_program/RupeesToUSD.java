package _02_first_java_program;

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input currency in rupees
        System.out.println("How many rupees you want to convert? ");
        System.out.print("Enter the amount: ");
        double rupees = in.nextDouble();
        // 1 dollar is equal to 81.39 rupees
        // so 1 rupee is equal to 1 / 81.39 dollar

        // Rupees to dolalar
        double rupeesToDollars = rupees * (1 / 81.39);
        System.out.println("Rs." + rupees + " is equal to $"+ rupeesToDollars);
    }
}
