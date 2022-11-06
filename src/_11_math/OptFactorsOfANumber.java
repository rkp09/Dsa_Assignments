package _11_math;

import java.util.ArrayList;

public class OptFactorsOfANumber {
    public static void main(String[] args) {
        factors(21);
    }

    public static void factors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0){
                System.out.println(i);
                list.add(0,n / i);
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
