package _04_functions;

import java.util.Scanner;

public class PalindromeDetection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome.");
        }else{
            System.out.println(n + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int n){
        // negative number can't be palindrome. So
        // avoid them and if the last digit of a
        // number is 0 it can't be palindrome also.
        if (n < 0 || (n % 10 == 0 && n != 0))
            return false;

        // Store n in a temp variable
        int temp = n;
        // Reverse the number
        int reverse = 0;
        while(temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        return reverse == n;
    }
}
