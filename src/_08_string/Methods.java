package _08_string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Prite Dey";
        System.out.println(name.charAt(0));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("ri"));
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('r'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("   Prite Dey   ".strip());
        System.out.println("   Prite Dey   ".trim());

    }
}
