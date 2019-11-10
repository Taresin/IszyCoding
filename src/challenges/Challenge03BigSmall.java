package challenges;

import java.util.Random;
import java.util.Scanner;

public class Challenge03BigSmall {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Ask user for a number (flipCount)
        printStatement("Think and write down a number");
        int userNumber = scanner.nextInt();
        sleep();


        // Create random number generator
        //see above

        // Generate (flipCount) numbers and add them up
        int RNGTotal = 0;
        for (int i = 0; i < userNumber; i++) {
            int RNG = random.nextInt(10);
            System.out.println(RNG);
            RNGTotal = RNGTotal + RNG;
        }
        sleep();
        System.out.printf("RNG Total = %d, ",RNGTotal);
        sleep();


        // If the total is an even number, the user wins, otherwise they lose
        if (RNGTotal % 2 == 0){
            System.out.println("you win");
        }
        else {
            System.out.println("you loose");
        }

        // Tell the user if they win or lose


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
