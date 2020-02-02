package exercises.textbook;

import java.util.Scanner;

public class P3_25 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to provide a single character from the alpha­ bet.
        Print Vowel or Consonant, depending on the user input.
        If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
         */

        // vowel
        //consonant
        //length >1
        //not a letter - int?

        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.println("pick a single character from the alphabet");
        String userCharacter = scanner.nextLine();
        //userCharacter = userCharacter.toLowerCase();

        boolean isMultipleChar = userCharacter.length() > 1;
        boolean isNotLetter = userCharacter.equals("0") || userCharacter.equals("1") || userCharacter.equals("2") || userCharacter.equals("3")
                || userCharacter.equals("4") || userCharacter.equals("5") || userCharacter.equals("6")
                || userCharacter.equals("7") || userCharacter.equals("8") || userCharacter.equals("9");
        boolean isVowel = userCharacter.equalsIgnoreCase("a") || userCharacter.equalsIgnoreCase("e")
                ||userCharacter.equalsIgnoreCase("i") ||
                userCharacter.equalsIgnoreCase("o") ||userCharacter.equalsIgnoreCase("u");

        if (isMultipleChar || isNotLetter) {
            System.out.println("error");
        }
        else if (isVowel) {
            System.out.println("Vowel");
        }
        else {
            System.out.println("consonant");
        }


    }
}
