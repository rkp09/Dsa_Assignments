package _01_flow_of_program;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.print("Enter a number to add or type 'x' to quite : ");
            String input = in.next();
            if (input.equals("x") || input.equals("X")){
                break;
            }
            sum += Integer.parseInt(input);
        }

        System.out.println("Sum of these numbers is: " + sum);
    }
}
