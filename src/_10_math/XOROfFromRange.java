package _10_math;

public class XOROfFromRange {
    public static void main(String[] args) {
        int start = 9;
        int end = 21;
        // First get the xor value of 1 till end
        int xorValue = xor(end);

        // Now we get the xor of n numbers from 1. To get the actual
        // xor value in a range we need to perform xor with (i - 1) and xorValue.
        // Because we want to get the xor from i to n. But originally xor
        // value contains (i - 1) numbers xor value.
        int originalXor =  xorValue ^ xor((start - 1));
        System.out.println(originalXor);
    }

    public static int xor(int n){
        if (n % 4 == 1){
            return 1;
        }

        if (n % 4 == 2){
            return n + 1;
        }

        if (n % 4 == 3){
            return 0;
        }

        if (n % 4 == 0){
            return n;
        }

        // Default case if something went wrong
        return -1;
    }
}
