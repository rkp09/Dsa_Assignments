package _07_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DisappearedNums {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List <Integer> list = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
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

        List<Integer> ans = new ArrayList<>();
        // If the nums at index not equal to index + 1 then store the number in ans list.
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1)
                ans.add(index + 1);
        }

        return ans;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}