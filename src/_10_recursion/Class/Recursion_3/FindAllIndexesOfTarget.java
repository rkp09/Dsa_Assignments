package _10_recursion.Class.Recursion_3;

import java.util.ArrayList;

public class FindAllIndexesOfTarget {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 21, 53, 21, 21, 10};
        System.out.println(findAllIndex(arr, 21));
    }


    // Take list as an argument.
    public static ArrayList<Integer> findAllIndex(int[] arr, int target){
        // Create an arrayList to store the indexes
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length == 0){
            return list;
        }

        return helper(arr, 0, target, list);
    }

    public static ArrayList<Integer> helper(int[] arr, int index, int target, ArrayList<Integer> list){
        if (arr.length == index){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return helper(arr, index + 1, target, list);
    }


    // Find all index without using list as an argument in the method.
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target){

        if (arr.length == 0){
            return new ArrayList<>();
        }

        return helper2(arr, 0, target);
    }

    public static ArrayList<Integer> helper2(int[] arr, int index, int target){
        // Create an arrayList to store the indexes
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length == index){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> returnedList =  helper2(arr, index + 1, target);

        list.addAll(returnedList);
        return list;
    }

}
