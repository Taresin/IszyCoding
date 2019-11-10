package lucia;

import challenges.LeetCode01;

import java.util.Scanner;

public class Workshop2 {
    public static void main(String[] args) {
        // runExercise1Program();
        // runExercise2Program();
        //  runExercise3Program();
        // runExercise4Program();
        //runExercise5Program();
        //runExercise6Program();
        runExercise7Program3();

        trial2();
    }

    /*
    Exercise 1.

    Write a program that prints someones full name.

    For example:

    In code: String lastName = "Hageraats"
    in code: String firstName = "Esther"

    Output: Your full name is Esther Hageraats
     */
    public static void runExercise1Program() {
        String lastName = "Leet";
        String firstName = "Sexy";
        System.out.println(firstName + " " + lastName);

    }


    /*
    Exercise 2

    Repeat the last exercise, but this make a nice prompt that asks the user for
    input.

    For example:

    Output: Who should I greet? ​Ruud Hello, Ruud
    */
    public static void runExercise2Program() {
        //user input - only need one
        Scanner scanner = new Scanner(System.in);

        //ask for name
        System.out.println("Who should i greet?");

        //user input
        String userString = scanner.next();

        //output
        System.out.println("Hello" + " " + userString);

    }

    /*
    Exercise 3

    ★★ Write a program that prompts the user for the current day and responds with a reaction to
    that day. You may define your own responses.

    For example:
    What is the current day? ​Monday Aaaaaaaaaaaaaaaaaaaargh!

    And:
    What is the current day? ​Friday It's almost weekend!
     */

    public static void runExercise3Program() {
        //user input - only need one
        Scanner scanner = new Scanner(System.in);

        //prompt user
        System.out.println("what is the current day?");

        //user input
        String userString = scanner.next();
        if (userString.equalsIgnoreCase("Monday")) {
            System.out.println("Noooooooo");
        } else if (userString.equalsIgnoreCase("Friday")) {
            System.out.println("yesssssss");
        } else {
            System.out.println("work work work work!");
        }

    }

    /*
    Exercise 4

    ★★ What are the values of the following expressions if you assume that ​n = 17 ​ & ​m =
    18​ ?

    (Try to reason about it first, than use your laptop to confirm.)
        • n / 10 + n % 20 = 18
        • n % 2 + m % 20 = 1 + 18 = 19
        • (m + n) / 2 = 17
        • (m + n) / 2.0 = 17. 5
        • (int) (0.5 * (m + n)) = 17
     */
    final static int n = 17;
    final static int m = 18;

    public static void runExercise4Program() {
        //1
        System.out.println("n / 10 + n % 20 = " + (n / 10 + n % 20));
        System.out.println("n = " + ((int) (0.5 * (m + n))));


    }

    /*
    Exercise 5
    ★★ Write a program that creates 9 variables and prints the value of the variables on the right location of the gameboard.

    For example:

        1 | 2 | 3
       -----------
        4 | X | O
       -----------
        7 | 8 | 9
Displaying arrays: To print an array, you have to print each element in the array using a loop like the following:
for (int i = 0; i < myList.length; i++) { System.out.print(myList[i] + " ");
}

     */
    public static void runExercise5Program() {
        //  int [][] matrix;
        //matrix = new int[3][3];
        //matrix [1][0] = 4;
        //System.out.println(matrix);

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},

        };

        String[][] array1 = {
                {"carl", "andy", "mi"},
                {"carl", "andy", "mi"},
                {"carl", "andy", "mi"},
        };
        //print matrix[0][0], matrix[0][1], matrix[0][2];
        // matrix[1][0]


        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(array1[j][i] + " ");

            }
            System.out.println();

        }


    }

    /*
    Exercise 6

    ★★ Write a program that allows you to enter a number and print that value multipled by one million (1000000).

    Answer the following questions:
        a. What happens if you enter "2000" ?
        b. What happens if you enter "3000" ?
        c. Can you think of an explanation?
        d. What happens if you enter the character 'g' ?

    */
    public static void runExercise6Program() {
        //user input
        Scanner scanner = new Scanner(System.in);

        //prompt user
        System.out.println("please enter a value");

        //input
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Not a Number");
            return;
        }

//        int max1 = Integer.MAX_VALUE/1000000;
//        System.out.println(max1);

        //multiply by 1million
        int multiplied = i * 1000000;


        //output
        if (i <= 2147) {
            System.out.println(multiplied);

        } else if (i > 2147) {
            System.out.println("Number is too big");
        } else {
            System.out.println("nothing");
        }


    }

    /*
    Exercise 7

    ★★ Write a program that calculates the amount of change (and corresponding coins/bills) given a certain purchase.
    First you should prompt for the amount due and amount paid.
    There are no bills / coins larger than 100 euro present in the store.

    Amount due (in cents):​$52.15
    Amount paid (in cents): $​100.00
    Change: $47.85
            100 euro: 0
            50 euro: 0
            20 euro: 2
            10 euro: 0
            5 euro: 1
            2 euro: 1
            1 euro: 0
            50 cent: 1
            20 cent: 1
            10 cent: 1
            5 cent: 1
     */
    public static void runExercise7Program() {


        //prompt amount
        int amountDue = 5215;

        //prompt paid
        int amountPaid = 10000;

        //change
        int change = 4785;

        //calculations
        int euroMajor = change / 2000;
        System.out.println(euroMajor + " x " + "$20 bills");

        int euroMinor = change % 2000;
        System.out.println(euroMinor);

        int euroMajorTwo = euroMinor / 500;
        System.out.println(euroMajorTwo + " x " + "$5 bills");

        int euroMinorTwo = euroMinor % 500;
        System.out.println(euroMinorTwo);

        int t = euroMinorTwo / 200;
        System.out.println(t + " x " + "$2 bills");

        int t2 = euroMinorTwo % 200;
        System.out.println(t2);

        int c = t2 / 50;
        System.out.println(c + " x " + " 50 cents");

        int c2 = t2 % 50;
        System.out.println(c2);

        // how comp will recognise the amount

    }

    public static void trial2() {
        //prompt amount
        int amountDue = 5215;

        //prompt paid
        int amountPaid = 10000;

        //change
        int change = amountPaid - amountDue;  // 4785

        int hundredsCount = change / 100_00;  // 0
        System.out.println(hundredsCount + " x " + "$100 bills");

        change = change - hundredsCount * 100_00;

        int fiftiesCount = change / 50_00;  // 0
        System.out.println(fiftiesCount + " x " + "$50 bills");

        change = change - fiftiesCount * 50_00;

        int twentiesCount = change / 20_00;  // 0
        System.out.println(twentiesCount + " x " + "$20 bills");

        change = change - twentiesCount * 20_00;

        int tensCount = change / 10_00;  // 0
        System.out.println(tensCount + " x " + "$10 bills");

        change = change - tensCount * 10_00;

        int fivesCount = change / 5_00;  // 0
        System.out.println(fivesCount + " x " + "$5 bills");

        change = change - fivesCount * 5_00;

        int onesCount = change / 1_00;  // 0
        System.out.println(onesCount + " x " + "$1 bills");

        change = change - onesCount * 1_00;

        int fiftycentsCount = change / 50;  // 0
        System.out.println(fiftycentsCount + " x " + "50c coin");

        change = change - fiftycentsCount * 50;

        int twentycentsCount = change / 20;  // 0
        System.out.println(twentycentsCount + " x " + "20c coin");

        change = change - twentycentsCount * 20;

        int tencentsCount = change / 10;  // 0
        System.out.println(tencentsCount + " x " + "10c coin");

        change = change - tencentsCount * 10;

        int fivecentsCount = change / 5;  // 0
        System.out.println(fivecentsCount + " x " + "5c coin");

        change = change - fivecentsCount * 5;

    }

    public static void runExercise7Program3() {

        int change = 4785;

        int[] denominations = {100_00, 50_00, 20_00, 10_00, 5_00, 2_00, 1_00, 50, 20, 10, 5};
        for (int i = 0; i < denominations.length; i++) {
            int currentDenomination = denominations[i];
            int denomCount = change / currentDenomination;
            change = change - denomCount * currentDenomination;
            if (currentDenomination > 200) {
                System.out.printf("There are %d x $%d bills\n", denomCount, currentDenomination);
            } else {
                System.out.printf("There are %d x %dc coins\n", denomCount, currentDenomination);
            }
        }
    }
}
