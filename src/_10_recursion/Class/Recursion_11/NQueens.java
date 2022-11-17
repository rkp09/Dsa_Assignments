package _10_recursion.Class.Recursion_11;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));

    }
    
    public static int queen(boolean[][] board, int row){

        if (row == board.length){
            display(board);
            System.out.println();

            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            // If this place is safe then put the queen in this cell
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queen(board, row + 1);

                // backtracking
                board[row][col] = false;
            }
        }

        return count;
    }

    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Check the column direction if there is any queen
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // Find the minimum of row and column for left diagonal
        int minLeft = Math.min(row, col);

        // Check the left diagonal
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        // Find the minimum of row and column for right diagonal
        int minRight = Math.min(row, board.length - col - 1);

        // Check the right diagonal
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }
}
