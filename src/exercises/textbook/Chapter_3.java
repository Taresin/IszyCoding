package exercises.textbook;

import java.util.Scanner;

public class Chapter_3 {
    public static void main(String[] args) {
        final double hourlyWage = 9.25;

        final double overtime = 1.5 * hourlyWage; //overtime is paid at 150%

        Scanner scanner = new Scanner(System.in);

        //name
        System.out.println("what is your name?\n");
        String employerName = scanner.next();

        //hours worked
        System.out.println("How many hours have you worked in the past week?\n");
        double hoursWorked = scanner.nextFloat();

        if (hoursWorked <= 40) {
            double wage = hoursWorked * hourlyWage;
            System.out.printf("Name: %s, Wage: $%.2f ", employerName, wage);

        } else {
            double wage = overtime * hoursWorked;
            System.out.printf("Name: %s, Wage: $%.2f ", employerName, wage);

        }
    }
}
