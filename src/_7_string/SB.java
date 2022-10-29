package _7_string;

public class SB {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        /*
        StringBuilder in java don't create another object inside heap memory
        instead it just use the previous memory and keep adding value to it.
        That should give us space complexity of O(n) and time complexity of
        O(n).
         */
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            build.append(ch);
        }

        System.out.println(build);
    }
}
