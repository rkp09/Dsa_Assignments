package _12_opp.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        arr = new int[] {1, 2, 3, 4, 5};
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        // Shallow copy.
//        return super.clone();
//    }


    // Deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();

        twin.arr = new int[this.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = arr[i];
        }

        return twin;
    }
}
