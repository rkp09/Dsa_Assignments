package _10_math;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(powerOfTwo(n));
    }

    public static boolean powerOfTwo(int n){
        // If n & (n - 1) == 0 then it is the power of 2
        return (n & (n - 1) ) == 0;
    }
}
