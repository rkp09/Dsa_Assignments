package _02_first_java_program;

import java.util.Scanner;

public class Calculate_value_by_chosen_operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter first number: ");
        int first = in.nextInt();
        System.out.print("Enter second number: ");
        int second = in.nextInt();

        // Input operator
        System.out.print("Enter a operator: ");
        String operator = in.next();

        // Storing the result of two sum by using chosen operator
        int result = 0;
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (first == 0) {
                        System.out.println("0 can't divided by any number.");
                    } else {
                        result = first / second;
                    }
                    break;
            }
        }else{
            System.out.println("Not a valid operator.");
        }

        System.out.println("Result is " + result);
    }
}
