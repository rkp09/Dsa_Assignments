package _04_functions;

import java.util.Scanner;

public class PrimeDetection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Enter a number
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(isPrime(n))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }

    public static boolean isPrime(int n){
        int i = 2;

        while(i <= n / i){
            if (n % i == 0)
                return false;
            i++;
        }

        return true;
    }
}
