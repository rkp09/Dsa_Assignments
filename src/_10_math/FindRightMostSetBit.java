package _10_math;

public class FindRightMostSetBit {
    public static void main(String[] args) {
        int number = 35840;
        System.out.println(position(number));
    }

    public static int position(int n){
        // Create a count variable
        // Find the length of the number using Math.log().
        // Use a loop.
        // Then do n & 1. If this gives us greater than 0 then increment count
        // break the loop and return count.
        // Otherwise, left shift
        // Since 1 & 1 = 1 and 0 & 1 = 0. That's why we will use bitwise and.

        int count = 0;

        // Length of the binary representation of number
        int len = (int) (Math.log(n) / Math.log(2)) + 1;
        int operand = 1;

        while (count < len){
            count++;
            if ((n & operand) > 0){
                break;
            }
            // Left shift the operand 1 times
            operand <<= 1;
        }

        return count;
    }
}
