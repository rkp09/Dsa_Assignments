package _11_math;

public class FindThe_ith_bitOfANumber {
    public static void main(String[] args) {
        // Steps:
            // Convert the number in binary. We know any bit & 1 will give us the original bit.
            // To get the bit we need to create a mask.
            // Mask is going to be 1 << (left shifted) (i - 1) times. If I shift this (i - 1) times
            // then 1 will take place in the ith position. All the bit in the right and left filed up by
            // 0. Then using & bitwise operator to get the bit from ith position till 1 and then right
            // shift the answer by (i - 1) times. After doing this stuff we will get the ith bit of a number.

        int number = 534;
        int position = 9;
        System.out.println(bit(number, position));
    }

    public static int bit(int n, int pos){
        // After doing & operation between n and mask
        int current = n & (1 << (pos - 1));

        return current >> (pos - 1);
    }
}
