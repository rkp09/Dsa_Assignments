package _03_conditional_loops;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input an alphabet
        System.out.print("Enter an alphabet: ");
        // if someone type word
        String word = in.next();
        char alphabet = word.charAt(0);
        // If it is an uppercase alphabet
        if(Character.isUpperCase(alphabet)) alphabet = Character.toLowerCase(alphabet);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println("It is a vowel.");
        }else{
            System.out.println("It is a consonant.");
        }

    }
}
