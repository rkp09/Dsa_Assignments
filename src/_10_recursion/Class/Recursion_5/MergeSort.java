package _10_recursion.Class.Recursion_5;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 4, 9, 8, 11};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] nums){
        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = sort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        // Create an array of size left + right
        int[] ans = new int[left.length + right.length];

        // i , j, k are the indexes of left, right, and ans array respectively
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
}
