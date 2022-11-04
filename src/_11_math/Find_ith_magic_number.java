package _11_math;

/*
    Magic number:
        1 = 0 * 5^3 + 0 * 5^2 + 1 * 5^1 = 5
        2 = 0 * 5^3 + 1 * 5^2 + 0 * 5^1 = 25
        3 = 0 * 5^3 + 1 * 5^2 + 1 * 5^1 = 30
        4 = 1 * 5^3 + 0 * 5^2 + 0 * 5^1 = 125
        1 = 1 * 5^3 + 0 * 5^2 + 1 * 5^1 = 130

 */
public class Find_ith_magic_number {
    public static void main(String[] args) {
        for (int i = 1; i <= 21; i++) {
            System.out.println(magicNumber(i));
        }
    }

    public static int magicNumber(int n){
        int len = (int) (Math.log(n) / Math.log(2)) + 1;
        int number = 0;

        int i = 1;
        while (i <= len){
            int currentBit = n & 1;
            number += currentBit * Math.pow(5, i);

            // Right shifted n by 1 to get the next bit.
            n >>= 1;

            i++;
        }

        return number;
    }
}
