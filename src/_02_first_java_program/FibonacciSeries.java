package _02_first_java_program;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take the position of the fibonacci series
        System.out.print("Enter the nth position of fibonacci series: ");
        int position = in.nextInt();
        // Store the previous and current number
        int num = nthNumber(position);
        System.out.println(position + "th number in fibonacci series is " + num);
    }

    public static int nthNumber(int position){
        int previous = 0;
        int current = 1;
        if (position == 1){
            return 0;
        }
        for(int i = 2; i < position; i++){
            int temp = current;
            current += previous;
            previous = temp;
        }

        return current;
    }
}
