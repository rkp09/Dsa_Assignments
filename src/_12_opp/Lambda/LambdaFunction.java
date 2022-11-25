package _12_opp.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i * 3);
        }

        Consumer<Integer> func = num -> System.out.println(num);
        list.forEach(func);
        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subtract = (a, b) -> b - a;

        LambdaFunction lambda = new LambdaFunction();
        System.out.println(lambda.result(3, 5, sum));
        System.out.println(lambda.result(3, 5, product));
        System.out.println(lambda.result(3, 5, subtract));
    }

    public int result(int a, int b, Operation op){
        return op.operate(a, b);
    }
}
interface Operation{
    int operate(int a, int b);
}