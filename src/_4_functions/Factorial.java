package _4_functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n +"! = " + factorial(n));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }

        int factor = 1;
        for(int i = 1; i <= n; i++){
            factor *= i;
        }

        return factor;
    }
}
