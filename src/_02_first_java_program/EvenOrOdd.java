package _02_first_java_program;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number % 2 == 0){
            System.out.println("Even.");
        }else{
            System.out.println("Odd.");
        }
    }
}
