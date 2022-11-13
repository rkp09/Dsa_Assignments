package _10_recursion.Class.Recursion_6;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 2, 4};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int lo, int hi){
        if (lo == hi){
            return;
        }

        int s = lo;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e){
            while (nums[s] < pivot){
                s++;
            }

            while (nums[e] > pivot){
                e--;
            }

            if (s <= e){
                // swap them
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Now sort the left part of the pivot
        sort(nums, lo, e);

        // Now sort the right part of the pivot
        sort(nums, s, hi);
    }
}
