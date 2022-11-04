package _09_patterns;

public class Pattern_8 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Running number of row times.
        for (int row = 0; row < n; row++) {
            // Creating number of space required to align it to the right side
            int N = n - row - 1;
            for (int i = 1; i <= N; i++) {
                System.out.print(" ");
            }

            // Formula to print number of asterisk
            int numOfAsterisk = 2 * row + 1;
            // Running number of row times to print such column.
            for (int col = 0; col < numOfAsterisk; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
