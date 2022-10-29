package _7_string;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        /*
        Concatenate char with a char this will give us sum of these char
        of ascii value.
         */
        System.out.println('p' + 'r');

        /*
        Concatenate string with a string will give us a string.
         */
        System.out.println("Ridoy " + "Prite");

        /*
        Concatenation of string and int will give us a string.
        How can it happen? int will get converted to wrapper
        class called Integer. Then wrapper class has a method
        called toString() and then int converted into string.
        Then we have something like "string" + "number" which
        was previously "string" + number.
         */
        System.out.println("Prite Ridoy " + 21);

        /*
        Concatenation of string and object type will give us
        string also. Because anything we printed out in the
        console that should give us a string.
         */
        System.out.println("This is object " + new ArrayList<>());
        System.out.println("Prite " + new Integer(21));
    }
}
