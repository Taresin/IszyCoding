package exercises.textbook;

import java.util.Scanner;

public class Supermarket_coupons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ask for cost
        System.out.println("Please enter cost of your groceries\n");
        double userCost = scanner.nextDouble();


        double per = 0.2;

        if (userCost < 10) {
            per = 0;
        } else if (userCost < 60) {
            per = 0.08;

        } else if (userCost < 150) {
            per = 0.10;
        } else if (userCost < 210) {
            per = 0.12;
        } else {
            per = 0.14;
        }

        double discount = per * userCost;
        double percentage = per * 100;

        if (per == 0) {
            System.out.println("No coupons awarded");
        } else {
            System.out.printf("You win a discount coupon of $ %.2f . (%.0f%% of your purchase)", discount, percentage);
        }

    }
}
