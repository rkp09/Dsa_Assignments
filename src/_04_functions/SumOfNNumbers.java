package _04_functions;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Enter a number
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Sum of first " + n + " numbers: " + sum(n));
    }

    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }
}
