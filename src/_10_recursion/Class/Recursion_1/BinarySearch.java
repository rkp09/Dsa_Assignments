package _10_recursion.Class.Recursion_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 21, 27, 34, 65};
        int ans = binarySearch(nums, 21, 0, nums.length - 1);
        System.out.println(ans);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){

        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target){
            return mid;
        }

        if (nums[mid] < target){
            return binarySearch(nums, target, mid + 1, end);
        }

        return binarySearch(nums, target, start, mid - 1);
    }

}
