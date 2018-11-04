package challenges;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dougylee on 1/11/18.
 * <p>
 * We are going to create our version of the roulette game
 * Here are the rules of Roulette:
 * • There are 10 numbers
 * • The ball picks the numbers perfectly randomly
 * • If you get the number you get 10 times the amount you put in.
 * <p>
 * Step 1
 * Get the user to pick a number.
 * We will use this number to see if we get a hit.
 * <p>
 * Step 2
 * Ask the user to pick an amount of money.
 * <p>
 * Step 3
 * Get a random number between 1 and 10
 * Print out the spun number
 * <p>
 * Step 4
 * If you get a match, print out "Congratulations, you won $X!"
 * where X is the winnings.
 * If you lose, print out "No winnings. Better luck next time"
 * <p>
 * Step 5
 * Keep the game going with a loop instead of ending the program
 * <p>
 * Step 6
 * Start the user with $100
 * Modify the amount every time they bet and win
 * Give the user feedback on how much money they have
 * <p>
 * Step 7
 * Break the game when the user loses all their money.
 * <p>
 * Step 8
 * Make sure the user cannot bet more than what they have.
 * e.g. they have $10, they bet $20, the amount bet will be $10
 */
public class Challenge01Roulette {

    public static void main(String[] args) {
        int wallet = 100;
        int multiplier = 10;
        int rouletteSize = 10;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (wallet > 0) {

            //user pick number
            printStatemet("Please pick a number between 1 and 10");
            int userInt = scanner.nextInt();
            sleep();

            //user pick money
            printStatemet("Great, now pick how much you want to spend");
            System.out.print("$");
            int bet = -1;
            while (bet < 0 || bet > wallet){
                bet = scanner.nextInt();
                if (bet > wallet) {
                    System.out.printf("You do not have enough! Please bed under %d\n", wallet);
                }
            }

            sleep();

            //winnings
            int winnings = bet * multiplier;

            //random number
            printStatemet("This is a random number");
            int randomNumber = random.nextInt(rouletteSize) + 1;
            System.out.println(randomNumber);


            //Does it match?
            if (randomNumber == userInt) {
                wallet = wallet + winnings;
                System.out.printf("Congratulations, you won $%d\n", wallet);
            } else {
                wallet = wallet - bet;
                System.out.printf("You did not win, you now have $%d\n", wallet);

            }

        }
        printStatemet("gameover");

    }

    public static void printStatemet(String statment) {
        System.out.println(statment);
    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
