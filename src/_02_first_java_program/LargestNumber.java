package _02_first_java_program;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        System.out.print("Enter second number: ");
        int second = in. nextInt();

        if(first > second){
            System.out.println(first + " is larger than " + second);
        }else if(first < second){
            System.out.println(second + " is larger than " + first);
        }else{
            System.out.println(first + " and " + second + " are equal.");
        }
    }
}
