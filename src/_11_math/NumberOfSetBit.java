package _11_math;

public class NumberOfSetBit {
    public static void main(String[] args) {
        int number = 21;

        System.out.println(setBits(number));
    }

    public static int setBits(int n){
        int bits = 0;
        while (n > 0){
            // Formula to find the fist set bit is (n & -n)
//            n -= (n & -n);
            // Another option
            n = n & (n - 1);
            bits++;
        }
        return bits;
    }
}
