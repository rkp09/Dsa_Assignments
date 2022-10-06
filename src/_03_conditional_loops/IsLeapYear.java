package _03_conditional_loops;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a year
        System.out.print("Enter a year: ");
        int year = in.nextInt();

        if(year % 400 == 0){
            System.out.println(year + " is a Leap year.");
        }else if(year % 100 == 0){
            System.out.println(year + " is not a Leap year.");
        }else if(year % 4 == 0){
            System.out.println(year + " is a Leap year.");
        }else{
            System.out.println(year + " is not a Leap year.");
        }
    }
}
