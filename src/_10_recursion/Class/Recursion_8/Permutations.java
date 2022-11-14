package _10_recursion.Class.Recursion_8;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
        List<String> ans = permutationsList("", "prite");
        System.out.println(ans);
    }

    public static void permutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        // Every time this method calls recursively take the first character of the string
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i);
            permutations(first + ch + last, up.substring(1));
        }
    }


    public static List<String> permutationsList(String p, String up){
        if (up.isEmpty()){
            // Create a list to store the ans
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Every time this method calls recursively take the first character of the string
        char ch = up.charAt(0);

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i);

            List<String> ans = permutationsList(first + ch + last, up.substring(1));

            list.addAll(ans);
        }

        return list;
    }


    public static int permutationsCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        // Every time this method calls recursively take the first character of the string
        char ch = up.charAt(0);

        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i);

            int ans = permutationsCount(first + ch + last, up.substring(1));

            count += ans;
        }

        return count;
    }
}
