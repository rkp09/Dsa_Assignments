package _01_flow_of_program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + number +" = " + (i * number));
        }
    }
}
