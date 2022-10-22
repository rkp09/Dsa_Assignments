package _6_searching;

import java.util.Arrays;

public class BSInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15},
                {16, 17, 18, 19}
        };

        System.out.println(Arrays.toString(findIndexes(arr, 16)));
    }

    public static int[] findIndexes(int[][] matrix, int target){
        // If the matrix has just one row then apply simple binary search
        if(matrix.length == 1){
            return binarySearch(matrix, 0, 0,matrix[0].length - 1, target);
        }

        int rStart = 0;
        int rEnd = matrix.length - 1;
        // Current middle column
        int cMid = (matrix[0].length - 1) / 2;

        while(rStart < rEnd - 1){
            // Middle row
            int rMid = rStart + (rEnd - rStart) / 2;

            if(matrix[rMid][cMid] == target){
                return new int[] {rMid, cMid};
            }

            if(matrix[rMid][cMid] < target){
                rStart = rMid;
            }else{
                rEnd = rMid;
            }
        }

        // Now that we have two rows left over. So we can apply binary search for the rStart row and then if
        // we get -1 in the answer array then we will apply binary search for the rEnd row.
        int cEnd = matrix[0].length - 1;
        int[] ans = binarySearch(matrix, rStart, 0, cEnd, target);

        if(ans[0] == -1){
            return binarySearch(matrix, rEnd, 0, cEnd, target);
        }

        return ans;
    }

    // Binary search in 2D sorted array
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart) / 2;

            // Check whether number at current column is equal to target
            if(matrix[row][cMid] == target){
                return  new int[] {row, cMid};
            }

            if(matrix[row][cMid] < target){
                cStart = cMid + 1;
            }else{
                cEnd = cMid - 1;
            }
        }

        return new int[] {-1, -1};
    }
}
