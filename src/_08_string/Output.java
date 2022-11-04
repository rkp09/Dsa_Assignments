package _08_string;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        /*
        Output that we see in the console is actually a string.
        But here a question arises that how a number, array and
        other type of data actually printed in console?
        We do it by using toString most of the time. Sometimes
        manually and another time internally toString method
        is used.
         */
        System.out.println(21);
        System.out.println("Prite");
        System.out.println(Arrays.toString(new int[] {9, 21}));
    }
}
