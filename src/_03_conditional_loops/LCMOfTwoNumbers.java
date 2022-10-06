package _03_conditional_loops;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two number
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        // find the max number
        int max = first > second? first : second;

        while(true){
            if(max % first == 0 && max % second == 0){
                System.out.println("Lcm of the " + first + " and " + second + " is " + max);
                break;
            }

            max++;
        }
    }
}
