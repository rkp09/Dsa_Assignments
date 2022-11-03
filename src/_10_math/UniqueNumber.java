package _10_math;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2};
        System.out.println(unique(nums));
    }

    public static int unique(int[] nums){
        int uni = 0;
        for (int i: nums) {
            uni ^= i;
        }

        return uni;
    }
}
