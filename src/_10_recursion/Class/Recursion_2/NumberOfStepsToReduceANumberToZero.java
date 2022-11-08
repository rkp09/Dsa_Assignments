package _10_recursion.Class.Recursion_2;

public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        if (num == 0){
            return 0;
        }

        return helper(num, 0);
    }

    public static int helper(int num, int steps){

        if (num == 0){
            return steps;
        }

        if ((num & 1) == 0){
            return helper(num / 2, ++steps);
        }

        return helper(num - 1, ++steps);
    }
}
