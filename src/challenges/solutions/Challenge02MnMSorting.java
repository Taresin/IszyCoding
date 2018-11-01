package challenges.solutions;

import java.util.Random;

/**
 * Created by dougylee on 1/11/18.
 *
 * We are picking MnMs out of a jar randomly.
 * There are 3 colors:
 *  • Red
 *  • Green
 *  • Blue
 *
 * Make an interactive game for the user to see which color gets picked the most.
 */
public class Challenge02MnMSorting {

    public static void main(String[] args) {

        Random random = new Random();

        int redBox = 0;
        int greenBox = 0;
        int blueBox = 0;

        int i = 0;
        while (i < 10) {
            int draw = random.nextInt(3);
            switch (draw) {
                case 0:
                    redBox++;
                    System.out.println("Picked a RED MnM");
                    break;
                case 1:
                    greenBox++;
                    System.out.println("Picked a GREEN MnM");
                    break;
                case 2:
                    blueBox++;
                    System.out.println("Picked a BLUE MnM");
                    break;
            }

            System.out.printf("RED %d\n", redBox);
            System.out.printf("GREEN %d\n", greenBox);
            System.out.printf("BLUE %d\n", blueBox);
            System.out.println("\n----------------\n");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

        if (redBox > greenBox && redBox > blueBox) {
            System.out.println("Red Wins");
        } else if (greenBox > redBox && greenBox > blueBox) {
            System.out.println("Green Wins");
        } else if (blueBox > redBox && blueBox > greenBox) {
            System.out.println("Blue Wins");
        } else {
            System.out.println("We don't have a clear winner");
        }
    }
}
