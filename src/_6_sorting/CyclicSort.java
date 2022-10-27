package _6_sorting;

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
            // If nums[i] is equal to nums[nums[i] - 1] it is in the correct index.
            // Example: If 1 is at 0 then it is in its correct index.
            if(i != nums[i] - 1){
                // Swap the value with its correct index
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}
