package _10_math;

public class XOR_of_all_N_numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(xor(i));
        }
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
