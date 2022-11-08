package _10_recursion.Class.Recursion_2;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        System.out.println(isSorted(arr));
    }


    public static boolean isSorted(int[] arr){
        if (arr.length == 1){
            return true;
        }

        return helper(arr, 0);
    }

    public static boolean helper(int[] arr, int index){
        if (arr.length - 1 == index){
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }
}
