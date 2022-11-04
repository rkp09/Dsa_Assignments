package _06_searching;

import java.util.Arrays;

public class FindRangeOfANumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 8, 8, 8, 10, 15, 16, 21};
        System.out.println(Arrays.toString(findRange(nums, 8)));
    }

    public static int[] findRange(int[] nums, int target){
        int[] ans = new int[2];
        ans[0] = findPosition(nums, target, false);
        ans[1] = findPosition(nums, target, true);
        return ans;
    }

    public static int findPosition(int[] nums, int target, boolean isAgnostic){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                ans = mid;
                if(isAgnostic){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return ans;
    }
}
