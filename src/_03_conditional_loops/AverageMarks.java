package _03_conditional_loops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double marks = 0;
        int numOfExams = 0;
        // Input for runs
        while(true){
            System.out.print("Enter marks of each subject and after putting all marks enter 'q': ");
            String mark = in.next();
            if (mark.equals("q") || mark.equals("Q")) break;

            marks += Double.parseDouble(mark);
            numOfExams++;
        }

        // Calculate batting average
        double average = marks / numOfExams;
        System.out.println("Average marks of this student is " + average);
    }
}
