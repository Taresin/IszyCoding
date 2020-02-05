package exercises.variables;

public class BooleanVariables {


    public static void main(String[] args) {

        // Boolean variables are like normal variables in that they hold a particular value.
        // Integers can have numbers up to "Integer.MAX_VALUE" which is about 2 billion.
        // Booleans only have two values true or false

        // These are the boolean equivalent of the integer variables below
        int randomNumber = 42;
        int randomNumber2 = 98;
        boolean randomBoolean = true;
        boolean randomBoolean2 = false;

        // Just like integers, we can write equations for the computer to calculate the value
        int integerCalculation = 47 * 52;
        boolean booleanCalculation = false && true;

        // The integer version of this is somewhat useful because you can see the numbers separated.
        // This is helpful for calculating the number of seconds in a day for example.
        int secondsInDay = 60 * 60 * 24;

        // The boolean version of this is probably not so useful in this form. e.g.
        boolean booleanCalculation2 = true && false || false && false;

        // This is because if you see each term in the equation (i.e. true or false), they don't have any meaning.
        // Whereas, if you look in the integer version, you can see that the numbers mean
        // 60 seconds in a minute * 60 minutes in an hour * 24 hours in a day.
        // We can rewrite secondsInDay equation with these meanings like this:

        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int secondsInDayV2 = secondsInMinute * minutesInHour * hoursInDay;

        // This is much more clearer for people to read your code because they don't need to make the
        // deduction that the 60 means seconds in a minute.
        // This improves readability of your code.

        // We can do the same with boolean variables
        // Booleans represent a value that is true or false

        int ageJono = 17;
        boolean isAdultJono = ageJono >= 18; // Results in false

        // So here we see that we've saved answer to the comparison as a variable.

        int ageDougy = 20;
        boolean isAdultDougy = ageDougy >= 18; // Results in true


        // If you put these two together, then it becomes more meaningful.
        // For example, if we can only hang out at the pub if all members of the party are adults,
        // we can do a quick check

        boolean canHangOutAtPub = isAdultJono && isAdultDougy; // Results in false

        // Because we've attributed meaning to the boolean values (true/false), this is much more useful than just typing:
        boolean booleanCalculation3 = false && true;


        // These practice exercises will go through some ways you can use boolean variables.

        /*
            Integers
         */

        // Direct comparison.
        int age = 45;
        boolean checkEquals = age == 97; // Check if the age is exactly a certain number
        boolean checkLess = age < 76; // Check if the age is less than a certain threshold
        boolean checkGreater = age > 76; // Check if the age is greater than a certain threshold

        // Sidenote: You can print out the values onto the console
        System.out.println(checkEquals);

        // TODO: Now try these exercises
        System.out.println("\n\nRunning exercise1()");
        exercise1();
        System.out.println("\n\nRunning exercise2()");
        exercise2();

        // Adding calculation
        boolean checkEqualsWithCalculation = age * 4 == 97;
        boolean checkLessWithCalculation = age / 14 < 3;
        boolean checkGreaterWithCalculation = age + 27 > 76;
        boolean checkRemainderWithCalculation = age % 2 == 0; // Check if the age is even number

        // You can add in variables on both sides of this calculation too.
        int superannuation = 14000;
        int income = 30000;
        boolean canRetire = superannuation >= (65 - age) * income;

        // TODO: Now try these exercises
        System.out.println("\n\nRunning exercise3()");
        exercise3();
        System.out.println("\n\nRunning exercise4()");
        exercise4();
        System.out.println("\n\nRunning exercise5()");
        exercise5();
    }

    /**
     * TODO: License
     * You are writing code for the RTA.
     * You have a customer who is 14 years old. They want to apply for a driver's license.
     * You can only get your license at 16 years old.
     *
     * Create an int variable for the customer's age.
     * Create a boolean variable to hold the answer to the age check
     * To get a good variable name, think about what the answer means
     * Print out the boolean variable.
     */
    public static void exercise1() {
        int customerAge = 14;
        boolean isOldEnough = customerAge == 16;
        System.out.println(isOldEnough);

    }

    /**
     * TODO: Payday
     * You get paid on the first day of the month
     * Write a program to check if it's the first day of the month.
     *
     * Follow similar steps to exercise 1.
     */
    private static void exercise2() {
        int dayOfMonth = 2;
        boolean isFirstDay = dayOfMonth == 1;
        System.out.println(isFirstDay);

    }

    /**
     * TODO: Snap
     * In the card game "Snap", players need to slap the card pile if the top card on the pile matches the previous card.
     * The last player to slap, collects all the cards.
     *
     * Create an int variable for the previous card (value between 1 and 13)
     * Create an int variable for the top card (value between 1 and 13)
     * Create a boolean variable that holds the answer if it's okay for the player to slap.
     * Print out the boolean variable
     */
    private static void exercise3() {
        int previousCard = 10;
        int topCard = 5;
        boolean canSlap = topCard == previousCard;
        System.out.println(canSlap);

    }

    /**
     * TODO: Snap (Modified)
     * In the card game "Snap", players need to slap the card pile if the top card on the pile matches the previous card.
     * The last player to slap, collects all the cards.
     *
     * We want to modify the game so that we slap if the top card is one more than the previous card.
     * E.g. if previous card = 4, we want to slap on 5.
     *
     * Create an int variable for the previous card (value between 1 and 13)
     * Create an int variable for the top card (value between 1 and 13)
     * Create a boolean variable that holds the answer if it's okay for the player to slap.
     * Print out the boolean variable
     */
    private static void exercise4() {
        int previousCard = 10;
        int topCard = 5;
        boolean canSlap = topCard == previousCard + 1;
        System.out.println(canSlap);

    }

    /**
     * TODO: Snap (Modified2)
     * We want to modify the game so that we slap if the top card is one up or one down from the previous card.
     * E.g. if previous card = 4, we want to slap on 5 or 3.
     *
     * Create an int variable for the previous card (value between 1 and 13)
     * Create an int variable for the top card (value between 1 and 13)
     * Create a boolean variable that holds the answer if it's okay for the player to slap.
     * Print out the boolean variable
     */
    private static void exercise5() {
        int previousCard = 10;
        int topCard = 5;
        boolean canSlap = topCard == previousCard + 1 || topCard == previousCard - 1;
        System.out.println(canSlap);

    }
}
