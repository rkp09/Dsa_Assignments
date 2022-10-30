package _8_patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Running number of row times.
        for (int row = 1; row <= n; row++) {
            // Creating number of space required to align it to the right side
            int N = row - 1;
            for (int i = 1; i <= N; i++) {
                System.out.print("  ");
            }
            // Running number of row times to print such column.
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
