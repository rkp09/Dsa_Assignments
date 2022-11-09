package _10_recursion.Class.Recursion_4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        sort(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int lastIndex, int currentIndex, int maxIndex){
        if (nums.length == 1){
            return;
        }

        if (lastIndex == 0){
            return;
        }

        if (lastIndex > currentIndex){
            if (nums[maxIndex] < nums[currentIndex]){
                sort(nums, lastIndex, currentIndex + 1, currentIndex);
            }else{
                sort(nums, lastIndex, currentIndex + 1, maxIndex);
            }
        }else{
            // If lastIndex == currentIndex that means we have max element index
            // Then swap
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[lastIndex - 1];
            nums[lastIndex - 1] = temp;

            sort(nums, lastIndex - 1, 0, 0);
        }
    }


}
