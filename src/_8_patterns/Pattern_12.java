package _8_patterns;

public class Pattern_12 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Number of row need to print.
        int numOfRow = 2 * n - 1;

        // Running number of row times.
        for (int row = 1; row <= numOfRow; row++) {
            // Creating number of space required to align it to the right side
            int numOfSpace = row > n ? numOfRow - row : row - 1;

            for (int i = 0; i < numOfSpace; i++) {
                System.out.print(" ");
            }

            // Number of column to print
            int numOfCol = n - numOfSpace;
            // Running number of row times to print such column.
            for (int col = numOfCol; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
