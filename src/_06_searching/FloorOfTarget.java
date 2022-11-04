package _06_searching;

public class FloorOfTarget {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 9, 11, 13, 15, 18, 19, 21};
        System.out.println(floor(nums, 9));
    }

    public static int floor(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

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

        return end;
    }
}
