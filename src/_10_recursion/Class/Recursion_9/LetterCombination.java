package _10_recursion.Class.Recursion_9;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }

    public static void letterCombination(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        // Get the value of the character number after subtract by '1'
        int charVal = up.charAt(0) - '1';

        // Get the lower bound of the loop from where things started
        int start = charVal * 3;
        int end = start + 3;

        for (int i = start; i < end && i < 26; i++) {
            char ch = (char) (i + 'a');

            letterCombination(p + ch, up.substring(1));
        }
    }

    public static List<String> letterCombinationList(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Get the value of the character number after subtract by '1'
        int charVal = up.charAt(0) - '1';

        // Get the lower bound of the loop from where things started
        int start = charVal * 3;
        int end = start + 3;

        List<String> list = new ArrayList<>();

        for (int i = start; i < end && i < 26; i++) {
            char ch = (char) (i + 'a');

            List<String> ans = letterCombinationList(p + ch, up.substring(1));

            list.addAll(ans);
        }

        return list;
    }





    /*
    Letter combinations : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     */

    public static List<String> letterCombinations(String digits) {
        if (digits.equals("")){
            return new ArrayList<>();
        }

        return combinations("", digits);
    }

    public static List<String> combinations(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Get the value of the character number after subtract by '2' because it starts from 2.
        int charVal = up.charAt(0) - '2';

        // Get the lower bound of the loop from where things started
        int start = charVal * 3;
        int end = start + 3;

        // In the case of 7, 8, 9 we need to change the start and end. Because 7 has 4 letters, 8 has 3 letters,
        // and 9 has 4 letters respectively.
        if (charVal == 5 || charVal == 6 || charVal == 7){
            if (charVal == 5){
                end += 1;
            } else if (charVal == 6){
                start += 1;
                end += 1;
            } else {
                start += 1;
                end += 2;
            }
        }

        List<String> list = new ArrayList<>();

        for (int i = start; i < end && i < 26; i++) {
            char ch = (char) (i + 'a');

            List<String> ans = combinations(p + ch, up.substring(1));

            list.addAll(ans);
        }

        return list;
    }
}
