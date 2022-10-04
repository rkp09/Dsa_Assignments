package _02_first_java_program;

import java.util.Scanner;
// Calculate the simple interest
public class PrincipalTimeRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Principal money
        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();
        // Time (year)
        System.out.print("Enter the time (in years): ");
        int time = in.nextInt();
        // Rate (per 100)
        System.out.print("Enter the rate of the interest: ");
        double rate = in.nextDouble();

        // Principal with interest
        double pInterest = principal;
        for (int i = 1; i <= time; i++){
            double interest = (pInterest * rate) / 100;
            pInterest += interest;
            System.out.println("Principal with interest after " + i + " year : " + pInterest);
        }
    }
}
