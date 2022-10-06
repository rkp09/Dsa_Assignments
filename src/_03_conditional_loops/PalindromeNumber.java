package _03_conditional_loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input a string
        System.out.print("Enter a number: ");
        String str = in.next();

        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        String reverseString = "";
        int len = str.length() - 1;

        for (int i = len; i >= 0; i--)
            reverseString += str.charAt(i);

        return str.equals(reverseString);
    }
}
