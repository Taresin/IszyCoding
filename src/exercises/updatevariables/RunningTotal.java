package exercises.updatevariables;

import java.util.Scanner;

public class RunningTotal {
    static Scanner scanner = new Scanner(System.in);

    // You are making a running scoreboard
    // Practice updating storage boxes and loops

    // 1. Create a variable for the scoreboard
    // 2. Retrieve an integer score from the user
    // 3. Print out the current score
    // 4. Get 5 more numbers from the user
    // 5. After each time the user gives you a number, print out what the new score is.

    public static void main(String[] args) {

        //create a variable for the scoreboard
        int scoreboard = 0;
        //scoreboard + userScoreNumber;


        //retrieve and integer score form the user
        for (int i = 0; i < 5; i++) {
            printStatement("Pick a number between 0-100");
            int userScoreNumber = scanner.nextInt();
            System.out.println(userScoreNumber);
            scoreboard = scoreboard + userScoreNumber;
            System.out.printf("Your score is %d\n", scoreboard);

        }
        //if the number is even, you add it to the score. if it is odd then you minus it from the score

    }

    public static void printStatement(String statement) {
        System.out.println(statement);

    }
}
