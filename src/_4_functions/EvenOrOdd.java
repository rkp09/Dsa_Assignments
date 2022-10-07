package _4_functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        evenOdd(n);
    }

    public static void evenOdd(int n){
        if (n % 2 == 0){
            System.out.println(n + " is a even number.");
        }else{
            System.out.println(n + " is a odd number.");
        }
    }
}
