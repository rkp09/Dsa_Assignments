package _09_patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        pattern(6);
    }

    public static void pattern(int n){
        // Printing the row
        for (int i = 1; i <= n; i++) {
            // Printing each column of the row
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // Create a new line after printing a whole row.
            System.out.println();
        }
    }
}
