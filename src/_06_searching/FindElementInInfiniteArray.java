package _06_searching;

// problem url: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,21};

        System.out.println(infiniteSearch(nums, 21));
    }

    public static int infiniteSearch(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(nums[end] < target){
            if(end * 2 < nums.length){
                int temp = end;
                // end = previous end + double the box value;
                end = end + (end - start + 1) * 2;
                start = temp + 1;
            }else{
                int temp = end;
                end = nums.length - 1;
                start = temp + 1;
            }
        }

        return binarySearch(nums, start, end, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
