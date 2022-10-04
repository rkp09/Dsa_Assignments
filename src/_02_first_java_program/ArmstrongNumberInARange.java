package _02_first_java_program;

import java.util.Scanner;

public class ArmstrongNumberInARange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two number
        System.out.print("Enter the range to get the number of armstrong number: ");
        int first = in.nextInt();
        int second = in.nextInt();

        for(int i = first; i <= second; i++){
            if(isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isArmstrong(int num){
        // Storing the number in a temp variable
        int temp = num;

        // After doing qube operation store the number in sum
        int sum = 0;
        while(temp > 0){
            // Get the last digit of the number
            int lastDigit = temp % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            //Get rid of last digit
            temp /= 10;
        }

        return sum == num;
    }
}
