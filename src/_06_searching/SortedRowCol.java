package _06_searching;

import java.util.Arrays;

public class SortedRowCol {
    public static void main(String[] args) {
        // Search in sorted row and sorted column matrix
        int[][] matrix = {
                {10, 15, 28, 40},
                {12, 17, 32, 44},
                {13, 21, 34, 46},
                {14, 24, 39, 50}
        };

        System.out.println(Arrays.toString(search(matrix, 14)));
    }


    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row, col};
            }

            if(matrix[row][col] > target){
                col--;
            }

            if(matrix[row][col] < target){
                row++;
            }
        }

        return new int[] {-1, -1};
    }
}
