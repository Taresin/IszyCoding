package challenges.solutions;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dougylee on 1/11/18.
 * We are going to create our version of the roulette game
 * Here are the rules of Roulette:
 *  • There are 10 numbers
 *  • The ball picks the numbers perfectly randomly
 *  • If you get the number you get 10 times the amount you put in.
 *
 * Step 1
 * Get the user to pick a number.
 * We will use this number to see if we get a hit.
 *
 * Step 2
 * Ask the user to pick an amount of money.
 *
 * Step 3
 * Get a random number between 1 and 10
 * Print out the spun number
 *
 * Step 4
 * If you get a match, print out "Congratulations, you won $X!"
 * where X is the winnings.
 * If you lose, print out "No winnings. Better luck next time"
 *
 * Step 5
 * Keep the game going with a loop instead of ending the program
 *
 * Step 6
 * Start the user with $100
 * Modify the amount every time they bet and win
 * Give the user feedback on how much money they have
 *
 * Step 7
 * Break the game when the user loses all their money.
 *
 * Step 8
 * Make sure the user cannot bet more than what they have.
 * e.g. they have $10, they bet $20, the amount bet will be $10
 */
public class Roulette {

    public static void main(String[] args) {

        int cash = 100;

        while (cash > 0) {
            System.out.printf("You have $%d in your wallet\n", cash);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Pick a number between 1 and 10");
            int pickedNumber = scanner.nextInt();

            System.out.println("How much will you bet? (positive whole numbers)");
            int bet = scanner.nextInt();

            if (bet > cash) {
                bet = cash;
            }
            cash -= bet;
            System.out.printf("You bet $%d\n", bet);

            Random random = new Random();
            int spunNumber = random.nextInt(10) + 1;// Add 1 because the numbers start from 0
            System.out.printf("The roulette table spun a %d\n", spunNumber);

            if (spunNumber == pickedNumber) {
                int winnings = bet * 10;
                System.out.printf("Congratulations, you won $%d!\n", winnings);
                cash += winnings;
            } else {
                System.out.println("No winnings. Better luck next time");
            }
        }

        System.out.println("You are out of money. Thank you for playing.");
    }
}
