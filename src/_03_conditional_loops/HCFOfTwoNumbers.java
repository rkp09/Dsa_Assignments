package _03_conditional_loops;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two number
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        int small = first;
        // Find the smallest number
        if (second < small)
            small = second;

        int hcf = 1;
        for(int i = 1; i <= small; i++){
            if (first % i == 0 && second % i == 0){
                hcf = i;
            }
        }

        System.out.println("HCF of " + first + " and " + second + " is " + hcf);
    }
}
