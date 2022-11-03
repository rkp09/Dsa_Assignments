package _10_math;

public class Set_ith_bit {
    public static void main(String[] args) {
        int number = 182;
        int i = 4;

        System.out.println(set(number, i));
    }

    public static int set(int n, int i){
        // To set the bit of ith bit we will use or operator
        // because 1 | 0 = 1 and 1 | 1 = 1. That's how we can
        // set the bit. Otherwise, if we use & operator then both
        // of this bit have to be 1. Otherwise, gives us 0.

        // First we need to create a mask. To actually put 1 in the ith
        // position of the mask we need to left shift 1 (i - 1) times.
        // And then use bitwise or operator to set the bit.

        return n | (1 << (i - 1));
    }
}
