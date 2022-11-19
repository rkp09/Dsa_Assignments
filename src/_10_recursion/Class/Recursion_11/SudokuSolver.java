package _10_recursion.Class.Recursion_11;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudoku(board)){
            display(board);
        } else {
            System.out.println("Something went wrong.");
        }

    }


    public static boolean sudoku (int[][] board){
        // Find the empty cell
        int row = -1;
        int col = -1;
        boolean isEmpty = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = true;
                    break;
                }
            }

            // If there is an empty cell then break the loop
            if (isEmpty){
                break;
            }
        }

        // If there is no empty cells in the sudoku then return true
        if (!isEmpty){
            return true;
        }

        // Choose a number to put in the cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)){
                board[row][col] = num;

                // If sudoku solved then it should return true
                if (sudoku(board)){
                    return true;
                } else {
                    // Backtracking
                    board[row][col] = 0;
                }
            }
        }


        // If nothing execute to true then something wrong in sudoku
        return false;
    }


    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check the whole row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num){
                return false;
            }
        }

        // Check the whole col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num){
                return false;
            }
        }


        // Find the row and col start of the 3 * 3 grid
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);

        // End the row and col of 3 * 3 grid
        int rowEnd = rowStart + 3;
        int colEnd = colStart + 3;

        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if (board[i][j] == num){
                    return false;
                }
            }
        }


        return true;
    }


    public static void display (int[][] board){
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
