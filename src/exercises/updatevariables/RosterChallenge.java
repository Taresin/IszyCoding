package exercises.updatevariables;

import java.util.Scanner;

public class RosterChallenge {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Ask user to input their name

        for (int i = 1; i < 6; i++) {
            printStatemtnt("What is your name?");
            String userName = scanner.next();
            System.out.printf("Hello %s,  you are employee %d\n", userName , i );
        }



    // You are writing an employee roster
    // Collect 5 names and tell them what employee number they are
        // Ask the user to input their name
        // Wrap this in a for loop so that it runs 5 times
        // Use the 'i' in for loop as the employee number
        // Print out a greeting. e.g. "Hello John, you are employee #4"
    }


    public static void printStatemtnt (String statement) {
        System.out.println(statement);
    }

    public static void sleep () {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
