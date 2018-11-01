package samples;

import java.util.Scanner;

/**
 * Created by dougylee on 1/11/18.
 */
public class UserInput {

    public static void main(String[] args) {

        // Create a scanner for the whole program. We only need one.
        Scanner scanner = new Scanner(System.in);


        // Retrieving integers
        System.out.println("Pick a whole number");
        int userInt = scanner.nextInt();
        System.out.printf("You selected %d\n", userInt);


        // Retrieving strings
        System.out.println("What is your name?");
        String userString = scanner.next();

        if (userString.equals("Jono")) {
            System.out.println("Hello Dumbass");
        } else {
            System.out.println("Hello " + userString);
        }


        // Retrieving doubles
        System.out.println("How many kilos of flour do you need?");
        double userDouble = scanner.nextDouble();
        System.out.printf("You have purchased %f kg of flour", userDouble);
    }

}
