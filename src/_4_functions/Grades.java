package _4_functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter your marks out of 100: ");
        int m = in.nextInt();

        String g = grade(m);
        System.out.println("You got " + g);
    }

    public static String grade(int m){
        if (m >= 91 && m <= 100){
            return "AA";
        }else if (m >= 81 && m <= 90){
            return "AB";
        }else if (m >= 71 && m <= 80){
            return "BB";
        }else if (m >= 61 && m <= 70){
            return "BC";
        }else if (m >= 51 && m <= 60){
            return "CC";
        }else if (m >= 41 && m <= 50){
            return "CD";
        }else{
            return "fail";
        }
    }
}
