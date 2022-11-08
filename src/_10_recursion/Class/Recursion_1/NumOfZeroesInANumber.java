package _10_recursion.Class.Recursion_1;

public class NumOfZeroesInANumber {
    public static void main(String[] args) {
        System.out.println(zeroes(5030));
    }

    public static int zeroes(int n){
        if (n == 0){
            return 1;
        }

        return helper(n, 0);
    }


    public static int helper(int n, int count){
        if (n == 0){
            return count;
        }

        int remainder = n % 10;

        if (remainder == 0){
            return helper(n / 10, count + 1);
        }

        return helper(n / 10, count);
    }




}
