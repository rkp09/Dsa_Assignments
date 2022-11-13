package _10_recursion.Class.Recursion_7;

public class SkipChar {
    public static void main(String[] args) {
//        skip("", "baccad");

        String ans = skipChar("baccad");
        System.out.println(ans);
    }

    public static void skip(String process, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(process);
            return;
        }

        StringBuilder build = new StringBuilder(unprocessed);
        StringBuilder pro = new StringBuilder(process);
        // Every time the skip method calls recursively we will choose the first character
        char ch = build.charAt(0);

        if (ch == 'a'){
            build.deleteCharAt(0);
            skip(process, String.valueOf(build));
        } else {
            pro.append(ch);
            build.deleteCharAt(0);
            skip(String.valueOf(pro), String.valueOf(build));
        }

    }

    // skip method using just only one string rather than pass the ans to the future call
    public static String skipChar(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }

        // First char for in every call
        char ch = unprocessed.charAt(0);

        if (ch == 'a'){
            return skipChar(unprocessed.substring(1));
        }else{
            return ch + skipChar(unprocessed.substring(1));
        }



    }
}
