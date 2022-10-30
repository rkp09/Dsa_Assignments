package _8_patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        int N = 2 * n;
        // Printing the row
        for (int row = 1; row < N; row++) {
            // total column in row
            int totalColumn = row;
            if (row > 5){
                totalColumn = N - row;
            }
            // Printing the column of column in each row
            for (int col = 1; col <= totalColumn; col++) {
                System.out.print("* ");
            }

            // Print a new line after printing a row
            System.out.println();
        }
    }
}
