package _09_patterns;

public class Pattern_13 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // Number of times loop run
        int N = 2 * n - 1;

        for (int row = 1; row <= N; row += 2) {

            // Space will run (n - 1) times every times the loop run
            // if n = 5 then space will run 4, 3, 2, 1, 0 times.
            int space = (N - row) / 2;
            // Create space
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (row < N){
                    if (col == 1){
                        System.out.print("*");
                    }else if(col == row){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
