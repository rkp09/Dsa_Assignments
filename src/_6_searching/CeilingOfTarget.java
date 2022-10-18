package _6_searching;
// Ceiling is something which is equal to the target number or the numbers
// which is greater than the target but smaller than all larger number than target.
public class CeilingOfTarget {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 8, 13, 15, 17, 19};
        System.out.println(ceil(nums, 14));;
    }

    public static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return start;
    }
}
