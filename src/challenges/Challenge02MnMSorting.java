package challenges;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dougylee on 1/11/18.
 * <p>
 * We have lots of MnMs in a jar.
 * There are 3 colors:
 * • Red
 * • Green
 * • Blue
 * <p>
 * There is a bucket for each of the colors.
 * MnMs are selected from the jar one at a time.
 * Each time, we put the MnM in it's respective bucket.
 * <p>
 * The bucket with the most MnMs at the end wins.
 * <p>
 * <p>
 * Make a game for the user to see which color gets picked the most.
 * <p>
 * 1. How do you represent each color?
 * 2. How do you represent each bucket?
 * 3. How would you let the user follow the "story"?
 */
public class Challenge02MnMSorting {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int Red = 1;
        int Green = 2;
        int Blue = 3;

        int RedStorage = 0;
        int GreenStorage = 0;
        int BlueStorage = 0;


        //user guess
        printStatement("Take a guess which M&M colour gets picked the most (red, green, blue)");
        String userGuess = scanner.next();
        sleep();

        //selecting random M&Ms

        int i1 = 1;
        while (i1 <= 10) {
            int randomNumber = random.nextInt(3) + 1;
            // System.out.println(randomNumber);

            //whileloop


            if (randomNumber == 1) {
                RedStorage += 1;
            } else if (randomNumber == 2) {
                GreenStorage += 1;
            } else {
                BlueStorage += 1;
            }
            i1++;
        }
        //print out each storage box
        System.out.printf("Each storage box contains:\nred storage %d\ngreen storage %d\nblue storage %d\n", RedStorage, GreenStorage, BlueStorage);
        sleep();
        //winner
        if (RedStorage > GreenStorage && RedStorage > BlueStorage) {
            printStatement("Red wins");

            if (userGuess == "Red") {
                printStatement("You win!");
                sleep();
            } else {
                printStatement("You lose");
            }
        } else if (GreenStorage > RedStorage && GreenStorage > BlueStorage) {
            printStatement("Green wins");

            if (userGuess == "Green") {
                printStatement("You win!");
                sleep();
            } else {
                printStatement("You lose");
            }
        } else {
            printStatement("Blue wins");
            if (userGuess == "Blue") {
                printStatement("You win!");
                sleep();
            } else {
                printStatement("You lose");
            }

        }
    }


    public static void printStatement(String statement) {
        System.out.println(statement);

    }

    public static void sleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
