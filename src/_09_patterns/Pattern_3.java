package _09_patterns;

public class Pattern_3 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Printing the row
        for (int i = n; i > 0; i--) {
            // Printing the column of column in each row
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            // Print a new line after printing a row
            System.out.println();
        }
    }
}
