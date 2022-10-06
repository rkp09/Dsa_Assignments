package _03_conditional_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the number to get the factorial of it
        System.out.print("Enter the number to get the factorial of it: ");
        int n = in.nextInt();

        int ans = factorial(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        int product = 1;
        // multiply the number by its all previous numbers
        for(int i = 1; i <= n; i++){
            product *= i;
        }

        return product;
    }
}
