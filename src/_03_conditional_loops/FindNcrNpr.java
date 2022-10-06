package _03_conditional_loops;

import java.util.Scanner;
/*
nPr :
    The permutation is the way of arranging the elements of a group or a set in order.

nCr :
    The combination an is the selection of elements from a group or a set, where the
    order of the elements does not matter.
 */
public class FindNcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formula for nPr is = n! / (n - r)!
        // Formula for nCr is = n! / r! (n - r)!
        // where, (n = set or population, r = subset of n or sample set

        // Input for n
        System.out.print("Enter the set or population (n): ");
        int n = in.nextInt();
        // Input for r
        System.out.print("Enter the subset of n (r): ");
        int r = in.nextInt();

        if (n > 0 && r > 0 && n >= r){
            // Calculate nPr
            long nPr = fact(n) / fact(n - r);
            long nCr = fact(n) / (fact(r) * fact(n - r));

            System.out.println(n + "P" + r + " = " + nPr);
            System.out.println(n + "C" + r + " = " + nCr);
        }
    }

    public static long fact(int n){
        if (n == 0) return 1;

        int product = 1;
        for (int i = 1; i <= n; i++){
            product *= i;
        }

        return product;
    }
}
