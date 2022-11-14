package _10_recursion.Class.Recursion_7;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("", "abc");
    }

    public static void subSequence(String process, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.print(process + ", ");
            return;
        }

        // Character at first index
        char ch = unprocessed.charAt(0);

        subSequence(process + ch, unprocessed.substring(1));
        subSequence(process, unprocessed.substring(1));
    }
}
