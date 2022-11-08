package _10_recursion.Class.Recursion_3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 21, 1, 18, 4};
        System.out.println(findLastIndex(arr, arr.length - 1, 1));
    }

    public static int findIndex(int[] arr, int startIndex, int target){
        if (arr.length == startIndex){
            return -1;
        }

        if (arr[startIndex] == target){
            return startIndex;
        }

        return findIndex(arr, startIndex + 1, target);
    }

    public static boolean find(int[] arr, int startIndex, int target){
        if (arr.length == startIndex){
            return false;
        }

        return arr[startIndex] == target || find(arr, startIndex + 1, target);
    }


    public static int findLastIndex(int[] arr, int lastIndex, int target){
        if (lastIndex == -1){
            return -1;
        }

        if (arr[lastIndex] == target){
            return lastIndex;
        }

        return findLastIndex(arr, --lastIndex, target);
    }
}
