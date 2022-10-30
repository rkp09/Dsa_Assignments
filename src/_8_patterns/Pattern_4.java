package _8_patterns;

public class Pattern_4 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        // Printing the row
        for (int i = 1; i <= n; i++) {
            // Printing the column of column in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print a new line after printing a row
            System.out.println();
        }
    }
}
