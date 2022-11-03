package _10_math;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(8));
    }

    public static boolean isOdd(int n){
        if ((n & 1) == 1){
            return true;
        }

        return false;
    }
}
