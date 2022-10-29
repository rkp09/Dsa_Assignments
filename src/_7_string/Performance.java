package _7_string;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        /*
        Everytime we concatenate a char to series it actually created a
        new object in the heap memory. So for that we have used so much
        memory. For that should give us space complexity of O(n^2) and also
        time complexity of O(n^2)
         */
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }

        System.out.println(series);
    }
}
