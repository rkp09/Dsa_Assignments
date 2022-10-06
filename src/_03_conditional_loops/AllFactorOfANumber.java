package _03_conditional_loops;

import java.util.Scanner;

public class AllFactorOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the number for what you get the factor
        System.out.print("Enter the number: ");
        int N = in.nextInt();

        for(int i = 1; i <= N; i++){
            if (N % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
