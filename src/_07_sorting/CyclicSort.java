package _07_sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4, 7, 9, 11, 10, 6, 8};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        int i = 0;

        // Run the loop until N
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                // Swap the value with its correct index
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }


    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
