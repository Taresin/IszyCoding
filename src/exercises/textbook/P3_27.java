package exercises.textbook;

import java.util.Scanner;

public class P3_27 {
    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter a month (1 for January, 2 for February, and so on)
        and then prints the number of days in the month. For February, print “28 or 29 days”.
Enter a month: 5 30 days
Do not use a separate if/else branch for each month. Use Boolean operators.
         */

        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Enter month in numbers");
        int userMonth = scanner.nextInt();

        boolean isFeb = userMonth == 2;

        if (isFeb) {
            System.out.println("28 or 29 days");
        } else {
            boolean thirtyDays = userMonth == 9 || userMonth == 4 || userMonth == 6 || userMonth == 11;
            boolean notValid = userMonth == 0 || userMonth > 12;

            if (notValid) {
                System.out.println("error, please enter valid number");
            } else if (thirtyDays) {
                System.out.println("Enter a month: " + userMonth + "\n30 days");
            } else {
                System.out.println("Enter a month: " + userMonth + "\n31 days");
            }
        }
    }
}
