package _10_recursion.Class.Recursion_4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        sort(nums, nums.length - 1, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int lastIndex, int currentIndex){
        if (nums.length == 1){
            return;
        }

        if (lastIndex == 0){
            return;
        }

        if (lastIndex > currentIndex){
            if (nums[currentIndex] > nums[currentIndex + 1]){
                // Swap the value
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[currentIndex + 1];
                nums[currentIndex + 1] = temp;
            }

            sort(nums, lastIndex, currentIndex + 1);
        }else{
            sort(nums, lastIndex - 1, 0);
        }
    }
}
