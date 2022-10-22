package _6_sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {-32, 1, 5, 2, 21, 39, -58};
        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        // Run the loop n times
        for (int i = 0; i < nums.length - 1; i++) {
            // Last number index
            int last = nums.length - i - 1;
            // Store the max number index
            int max = 0;
            // Find the maximum number index
            for (int j = 0; j <= last; j++) {
                if(nums[max] < nums[j]){
                    max = j;
                }
            }

            // Swap the maximum number with its corresponding position value
            int temp = nums[last];
            nums[last] = nums[max];
            nums[max] = temp;
        }
    }
}
