package _03_conditional_loops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int runs = 0;
        int innings = 0;
        // Input for runs
        while(true){
            System.out.print("Enter runs and put all runs enter 'q': ");
            String run = in.next();
            if (run.equals("q") || run.equals("Q")) break;

            runs += Integer.parseInt(run);
            innings++;
        }

        // Calculate batting average
        double average = (double) runs / innings;
        System.out.println("Batting average of this player is " + average);
    }
}
