package _8_patterns;

public class Pattern_9 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Running number of row times.
        for (int row = n; row > 0; row--) {
            // Creating number of space required to align it to the right side
            int N = n - row;
            for (int i = 0; i <= N; i++) {
                System.out.print(" ");
            }

            // Formula to print number of asterisk
            int numOfAsterisk = 2 * row - 1;
            // Running number of row times to print such column.
            for (int col = 0; col < numOfAsterisk; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
