package _10_math;

/*
  Question: How to find the number only appearing once? Except that number every number can be appeared
  3 or 5 or 7 etc times.
*/
public class UniqueNumber_2 {
    public static void main(String[] args) {
//        int[] nums = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int[] nums = {1, 2, 1, 2, 1, 2, 21, 1, 2, 2, 1};
        System.out.println(unique(nums));
    }

    public static int unique(int[] nums){
        // Find the maximum number from the array.
        // Get the length of the binary representation of the maximum number.
        // Create that length size of array.
        // Get the set bit of the binary representation of the number and increment
        // the cell of corresponding position in array.

        int max = 0;
        // Get the maximum value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        // Get the length of the binary representation of the maximum number
        int len = length(max);

        // Create the array of set bit
        int[] setBits = new int[len];

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            // Store the current number in a temp variable
            int temp = nums[i];
            while (j < length(nums[i])){
                // Check that temp & 1 gives us greater than zero or not
                // If it gives us 1 then increment corresponding cell value of setBit by 1.
                if ((temp & 1) > 0)
                    setBits[j]++;

                // Right shift the number to make it one digit less from the right
                temp >>= 1;

                j++;
            }
        }

        int uni = 0;
        // Get the remained of each number in the setBits and store them in corresponding place
        for (int i = 0; i < setBits.length; i++) {
            // % by number of time a number is duplicated.
            setBits[i] %= 5;

            // As we know full array is containing digit of unique number in binary
            // then just convert it into binary.
            uni = (int) (uni + setBits[i] * Math.pow(2, i));
        }

        return uni;
    }

    // Binary number length
    public static int length(int n){
        return (int) (Math.log(n) / Math.log(2) )+ 1;
    }
}
