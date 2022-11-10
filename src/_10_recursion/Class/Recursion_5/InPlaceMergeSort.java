package _10_recursion.Class.Recursion_5;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums, int start, int end){
        if ((end - start) == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        sort(nums, start, mid);
        sort(nums, mid, end);

        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        // Create an array of size left + right
        int[] ans = new int[end - start];

        // i , j, k are the indexes are the range of two side of the array respectively
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
            if (nums[i] < nums[j]){
                ans[k] = nums[i];
                i++;
            }else{
                ans[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i < mid){
            ans[k] = nums[i];
            i++;
            k++;
        }

        while (j < end){
            ans[k] = nums[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            nums[l + start] = ans[l];
        }
    }
}
