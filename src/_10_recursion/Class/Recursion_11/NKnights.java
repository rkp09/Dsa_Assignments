package _10_recursion.Class.Recursion_11;

public class NKnights {
    public static void main(String[] args) {
        int k = 4;
        boolean[][] board = new boolean[k][k];
        knights(board, 0, 0, k);
    }
    
    public static void knights(boolean[][] board, int row, int col, int knight){
        
        if (knight == 0){
            display(board);
            System.out.println();
            
            return;
        }

        if (row == board.length - 1 && col == board.length){
            return;
        }
        
        if (col == board.length){
            knights(board, row + 1, 0, knight);
            return;
        }
        
        if (isSafe(board, row, col)){
            board[row][col] = true;
            knights(board, row, col + 1, knight - 1);
            // Backtracking
            board[row][col] = false;
        }
        
        knights(board, row, col + 1, knight);
    }

    
    // Display the pattern how we can display knights that should not be eliminated
    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (int j = 0; j < board.length; j++) {
                if (row[j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println();
        }
    }

    // Check the position is safe to put our knights or not
    public static boolean isSafe(boolean[][] board, int row, int col){
//        if (row == board.length || col == board.length){
//            return false;
//        }
        // Check the left upper side
        if (isValid(board, row - 1, col - 2)){
            if (board[row - 1][col - 2]){
                return false;
            }
        }

        // Check the upper left side
        if (isValid(board, row - 2, col - 1)){
            if (board[row - 2][col - 1]){
                return false;
            }
        }

        // Check the upper right side
        if (isValid(board, row - 2, col + 1)){
            if (board[row - 2][col + 1]){
                return false;
            }
        }

        // Check the right upper side
        if (isValid(board, row - 1, col + 2)){
            if (board[row - 1][col + 2]){
                return false;
            }
        }
        
        return true;
    }
    
    // Check whether the row and col is out of bounds or not.
    public static boolean isValid(boolean[][] board, int row, int col){
        return (row >= 0 && row < board.length) && (col >=0 && col < board.length);
    }
}
