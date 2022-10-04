package _01_flow_of_program;

import java.util.Scanner;

/*
01. If a year is divisible by 400. Then it is a leap year.
02. If a year is not divisible by 400 but divisible by 100 (Century Year).
    Then it is not a leap year.
03. If a year is not divisible by 400 and also not divisible by 100 but
    divisible by 4. Then it is a leap year.
04. Otherwise, it is not a leap year.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year){
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }else if(year % 100 == 0){
            System.out.println(year + " is not a leap year.");
        }else if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
