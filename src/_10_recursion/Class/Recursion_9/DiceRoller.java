package _10_recursion.Class.Recursion_9;

import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    public static void main(String[] args) {
//        dice("", "5");
        System.out.println(diceList("", "3"));
    }

    public static void dice(String p, String up){
        if (up.equals("0")){
            System.out.println(p);
            return;
        }

        // Get the length of the roller to run loop that times
        int n = up.charAt(0) - '0';

        for (int i = 1; i <= n && i <= 6; i++) {
            dice(p + i, (n - i) + "");
        }
    }

    public static List<String> diceList(String p, String up){
        if (up.equals("0")){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Get the length of the roller to run loop that times
        int n = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n && i <= 6; i++) {
            list.addAll(diceList(p + i, (n - i) + ""));
        }

        return list;
    }
}
