package _12_opp.Cloning;

import java.util.Arrays;

public class Person {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human prite = new Human(22, "Prite Dey");

        // It can also create a clone of an object. But it takes a lot of time to create another one.
//        Human twin = new Human(prite);
        Human twin = (Human) prite.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(prite.arr));
    }
}
