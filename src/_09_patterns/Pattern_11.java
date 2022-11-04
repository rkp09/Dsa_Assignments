package _09_patterns;

public class Pattern_11 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Running number of row times.
        for (int row = 0; row < n; row++) {
            // Creating number of space required to align it to the right side
            for (int i = 1; i <= row; i++) {
                System.out.print(" ");
            }

            // Running number of row times to print such column.
            for (int col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
