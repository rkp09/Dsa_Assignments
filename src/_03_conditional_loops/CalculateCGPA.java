package _03_conditional_loops;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double points = 0;
        int numOfExams = 0;
        // Input for runs
        while(true){
            System.out.print("Enter points of each subject and put all points enter 'q': ");
            String point = in.next();
            if (point.equals("q") || point.equals("Q")) break;

            points += Double.parseDouble(point);
            numOfExams++;
        }

        // Calculate batting average
        double average = points / numOfExams;
        System.out.println("CGPA of this student is " + average);
    }
}
