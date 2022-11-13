package _10_recursion.Class.Recursion_7;

public class SkipAWord {
    public static void main(String[] args) {
        String str = "Ihaveanapplinmytable";
        System.out.println(skipAppNotApple(str));
    }

    public static String skipWord(String str, String word){
        if (str.isEmpty()){
            return "";
        }

        // Get the first char when we call skipWord recursively
        char ch = str.charAt(0);
        if (str.startsWith(word)){
            return skipWord(str.substring(word.length()), word);
        } else {
            return ch + skipWord(str.substring(1), word);
        }

    }


    // Skip the app when it is not apple in the string
    public static String skipAppNotApple(String str){
        if (str.isEmpty()){
            return "";
        }

        // Get the first char when we call skipWord recursively
        char ch = str.charAt(0);
        if (str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        } else {
            return ch + skipAppNotApple(str.substring(1));
        }

    }
}
