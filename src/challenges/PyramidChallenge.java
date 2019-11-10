package challenges;

import java.util.Scanner;

public class PyramidChallenge {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Ask user how many lines do they want
        printStatement("How many lines would you like in your pyramid diagram");
        int rowNumber = scanner.nextInt();

        // printing last line first
        int spacesNeeded = rowNumber - 1;
        int dashesNeeded = 1;

        for (int i = 0; i < rowNumber; i++) {
            // Print spaces
            for (int j = 0; j < spacesNeeded; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < dashesNeeded; k++) {
                System.out.print("-");
            }

            spacesNeeded--;
            dashesNeeded += 2;
            System.out.println();
        }
//        System.out.println();
//        for (int j = rowNumber; j > 0; j--) {
//            System.out.print(" " + "-");
//            //System.out.println();
//        }
        //System.out.println(" " + "-" + " ");

        // System.out.println(" " + "-" + " \n");
        //System.out.println("-");
        //  -
        // ---
        //-----
        //

        // System.out.println("-");
        // System.out.println("\n");


    }

    public static void printStatement(String statement) {
        System.out.println(statement);
    }
}
