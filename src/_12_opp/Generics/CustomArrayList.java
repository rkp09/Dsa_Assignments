package _12_opp.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
        if (size == data.length){
            resize();
        }

        data[size++] = num;
    }

    public void remove(int index){
        if (index + 1 < data.length){
            data[index] = data[index + 1];
        }

        size--;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("[");

        for (int i = 0; i < size; i++) {
            if (i == size - 1){
                build.append(data[i]);
            } else {
                build.append(data[i] + ", ");
            }
        }

        build.append("]");

        return build.toString();
    }



    private void resize() {
        Object[] temp = new Object[2 * size];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }



    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(9);
        list.add(21);
        list.add(2);
        list.add(5);

        System.out.println(list);
        list.remove(5);

        System.out.println(list);
    }
}
