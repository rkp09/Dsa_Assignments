package _4_functions;

import java.util.Scanner;

public class PrimeNumberInARange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input first number
        System.out.print("Enter start position: ");
        int start = in.nextInt();
        // Input end number
        System.out.print("Enter end position: ");
        int end = in.nextInt();

        System.out.println("From " + start + " - " + end + " prime numbers: ");
        while(start <= end){
            if(prime(start) != -1){
                System.out.print(start + " ");
            }

            start++;
        }

    }

    public static int prime(int n){
        int i = 2;

        while(i <= n / i){
            if (n % i == 0)
                return -1;
            i++;
        }

        return n;
    }
}
