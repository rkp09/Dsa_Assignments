package _03_conditional_loops;

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        // Days in month of August
        int days = 31;

        // Even days in August
        int evenDays = 0;
        for(int i = 1; i <= days; i++){
            if(i % 2 == 0) evenDays++;
        }

        System.out.println("Prite can go out with me " + evenDays + " days in August.");
    }
}
