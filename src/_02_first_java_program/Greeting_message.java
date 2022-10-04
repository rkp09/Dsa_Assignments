package _02_first_java_program;

import java.util.Scanner;

public class Greeting_message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + " !!!");
    }
}
