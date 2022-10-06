package _03_conditional_loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string : ");
        String str = in.next();

        String reverseString = "";
        int len = str.length() - 1;

        for (int i = len; i >= 0; i--)
            reverseString += str.charAt(i);

        System.out.println("Reverse string of " + str + " is " + reverseString);
    }
}
