package izzieprojects.budget;

import java.util.Scanner;

public class Budget {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //ask user what budget is
        printStatement("What is your income this fortnight?");
        int userIncome = scanner.nextInt();

        //ask user how much they want to save
        printStatement("How much as a percentage would you like to save this fortnight?");
        int userSave = scanner.nextInt();

        //calculation
        double percentage =  (userSave / 100);
        double saveAmt = percentage * userIncome;
        double availableMoney = userIncome - saveAmt;
        System.out.printf("This is the saving percentage %.2f\n", percentage);
        sleep();
        System.out.printf("This is how much you save $%.2f\n", saveAmt);
        sleep();
        System.out.printf("This is your budget for the fortnight $%.2f\n", availableMoney);


       while (availableMoney > 0){
           int userExpense = scanner.nextInt();
           int userPlusIncome = scanner.nextInt();

           availableMoney -= userExpense;
           availableMoney += userPlusIncome;
       }








        // need to ask user what budget is
        //objects -- ignore for now
        //calculations - savings
        //calc - expenses
    }

    public static void printStatement(String statement) {
        System.out.println(statement);

    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
