package _11_math;

public class Reset_ith_bit {
    public static void main(String[] args) {
        int number = 86;
        int i = 5;

        System.out.println(reset(number, i));
    }

    public static int reset(int n, int i){
        // Create mask. Place 1 to ith position.
        // Get the complement of mask.
        // Use & operator between the binary representation of the number
        // and the complement of the mask.

        int mask = 1 << (i - 1);
        // complement of the mask
        int complement = ~mask;

        return n & complement;
    }
}
