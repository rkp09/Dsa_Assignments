package _6_sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean isSorted = false;
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    isSorted = true;
                    // swap the adjacent element
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            if(!isSorted){
                break;
            }
        }
    }
}
