package exercises.updatevariables;

import java.util.Scanner;

public class OddEven {
    static Scanner scanner = new Scanner(System.in);

    // why don't you write a program similar to scoreboard but if the number is even, you add it to the score. if it is odd then you minus it from the score?
    public static void main(String[] args) {
        int scoreboard = 0;


        for (int i = 0; i < 20; i++) {
            System.out.println("Pick a number between 0-20");
            int userNumber = scanner.nextInt();
            System.out.println(userNumber);
            if (userNumber % 2 == 0) {
                scoreboard = scoreboard + userNumber;
                System.out.println("This number is even");
            } else {
                scoreboard = scoreboard - userNumber;
                System.out.println("This number is odd");
            }
            System.out.printf("Your final score is %d\n", scoreboard);
            if (scoreboard < 0) {
                scoreboard = 0;
                System.out.println("You can't go below 0");
            }



            //scoreboard = userNumber + scoreboard;

// greater than 0

        }
    }
}
