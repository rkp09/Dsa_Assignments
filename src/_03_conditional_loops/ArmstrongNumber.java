package _03_conditional_loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two number
        System.out.print("Enter the last range to get number of armstrong number: ");
        long range = in.nextInt();

        System.out.print("Armstrong number in this range: ");
        for(int i = 1; i <= range; i++){
            if(isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isArmstrong(long num){
        // Storing the number in a temp variable
        long temp = num;

        // After doing qube operation store the number in sum
        long sum = 0;
        while(temp > 0){
            // Get the last digit of the number
            long lastDigit = temp % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            //Get rid of last digit
            temp /= 10;
        }

        return sum == num;
    }
}
