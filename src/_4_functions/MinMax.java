package _4_functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        System.out.print("Enter the third number: ");
        int third = in.nextInt();

        int max = MAX(first, second, third);
        int min = MIN(first, second, third);

        System.out.println("From these number minimum number is " + min + " and maximum number is " + max);
    }

    public static int MAX(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        return max;
    }

    public static int MIN(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }

        if(c < min){
            min = c;
        }

        return min;
    }
}
