package exercises.loops;

public class WhileLoopPractice {

    public static void main(String[] args) {
        // Loops are code structures that repeat.
        // The idea of a loop is to get the computer to run a bit of code only if something is true.

        /*
            Lesson overview:
            The while loop is made of three parts:
                • The boolean check
                • The looping block of code
                • The modifier

            Let's look at these individually and then put them all together
         */

        /*
            Math Revision: Terms
            Terms are the lego pieces of a formula.

            If you look at a formula like "3 x 4", there are 2 terms: "3" and "4".
            If you have something more complicated like:

            (3 + 4) * (45 - 2)

            There are many ways of chopping this up into different terms.
            E.g. (3 + 4) and (45 - 2)

            A good way to think about it is can you substitute it for an algebra letter.
            So our first example is "3 x 4".
            We can substitute it for "a x b".

            For our second example: (3 + 4) * (45 - 2)
            We can substitute: "a * b"
            We can also do: "(a + b) * (c - d)"


            Revision: Boolean terms (true or false)
            We know that boolean values are either true or false just like integer values can be 4, 87 or 198.
         */

        boolean hasRedDress = true;
        boolean isUnderage = false;
        boolean canGoToSchoolParty = hasRedDress && isUnderage; // Here we have 2 terms.


        /*
            Expressions
            When you string together a bunch of terms, you get an expression.
            Expressions are little formulas that the computer has to calculate.
            Think of it as the stuff you type into the calculator.
            For example, you'd normally type into the calculator "4 x 7". This "4 x 7" is an expression.
            Or "5 - 4"

            Because we have storage boxes for values (variables) we don't have to type in the number directly.
            Instead, we can just type in the name of the variable and it is the computer's job to look at the storage box
            and drag the number out.
         */

        int ageJohnny = 24;
        int ageAmy = 22;
        int ageDifference = ageJohnny - ageAmy;

        /*
            Here we see that the expression is "ageJohnny - ageAmy".
            However, when the computer executes this line of code, it will pull up the right numbers
            and put it in the expression.

            The expression will convert to "24 - 22"
            There is another step called evaluating which like pressing the equals sign
            and getting the number "2"
            We will cover that next.

            But for now, I wanted you to get good at identifying what an expression is so that we can look
            at what the boolean version of this looks like below.
         */


        // A boolean expression is like a formula that you write up so the computer has to calculate.
        int age = 21;
        boolean canDrink = age >= 18; // The expression is the "age >= 18" part

        int money = 0;
        boolean canEnterBar = age >= 18 && money > 0; // Now we have a bigger expression made up of two smaller expressions:
        // "age >= 18" and  "money > 0"


        /*
            Evaluating expressions
            When you hit the equals sign on your calculator, it calculates the result.
            This is called evaluating.

            When the computer reads the expression above:  "age >= 18 && money > 0"

            Each term gets evaluated from left to right.
            1. --> "age >= 18" = true
            2. --> "money > 0" = false
            3. --> "true && false" = false

            The computer does this once and it will never go back to that line again.
         */



        /*
            When you're working with if statements, you secretly had to work with boolean expressions.
            Here we have a boolean expression: "millilitresDrunk < 2000"
            This means: "evaluate this boolean expression. And do some code if we get TRUE as the answer"
         */

        int millilitresDrunk = 500;
        if (millilitresDrunk < 2000) {
            System.out.println("Drink More Water!");
        }

        /*
            The code living inside the "{ }" is called a "code block".
            In an if statement, we always do the check first before running the code inside the code block.
            We can put any code inside of that code block like more if statements, more variables, loops.
            If you do, we say that these other if statements / loops are nested inside the bigger if statement.
         */


        /*
            While loops.
            Let's get to the point.

            While loops are like if statements.
         */

        int rain = 40;
        while (rain > 500) {
            System.out.println("It's flooding");
        }

        /*
            We can directly put in a boolean value into the boolean check to force a certain path.
            e.g.


            while (false) {
                System.out.println("It's flooding");  // This will never run
            }

            while (true) {
                System.out.println("It's flooding");  // This will run forever
            }

            These aren't super useful but it's good to know that we can plug in any boolean we want
            into the check
         */

        // Try These exercises to practice while loops that do not run
        exercise1();
        exercise2();

        // Try these exercises to practice while loops that run forever
        exercise3();
        exercise4();


        /*

            Loop Modifier

            Just like an if statement, if the boolean expression inside is false, you don't run the block of code.
            However, if it is true, then it will alternate between checking and running the code
            until the boolean expression is false.

            Check --> Run code --> Check --> Run code --> ...

            if we had something like this:

            int babyAge = 2;
            while (babyAge < 5) {
                System.out.println("Wah Wah");
            }

            This will go on forever because the expression will never change to false.

            We would have to modify this within the code block.
            There is a special word "break" which stops the loop but we will ignore this for now.
            We will learn what the "normal" way loops work first before we introduce these advanced controls.

            Below, we have some code to show a bank account with $1500.
            We want the computer to repeatedly print the words "Keep Saving" until we reach a threshold of $3000
         */

        int accountFund = 1500;
        while (accountFund < 3000) {
            System.out.println("Keep Saving");
            accountFund = accountFund + 200;
        }

        /*
            We see that we can modify the variable "accountFund" in any way we want within the code block.
            We can do any math operation we want to it as long as it makes sense for your calculation.
            i.e.
            accountFund = accountFund + 200;
            accountFund = accountFund - 200;
            accountFund = accountFund * 200;
            accountFund = accountFund / 200;
            accountFund = accountFund % 200;

            accountFund = accountFund + accountFund / 2;
            accountFund = accountFund + accountFund / 2 + 4;

            accountFund = accountFund + age * 20; // assuming there's a variable called age and this formula is relevant
         */

        // Try it yourself
        exercise5();
        exercise6();


        /*
            Sections of the code block
            We now see that a while loop has different parts:
                • The condition (boolean)
                • The code block
                • The modifier that lives inside the code block.

            It's useful to think of the code block as being in two parts:
                • The "work code"
                • The modifier

            All the exercises we did had code blocks that did very simple work. i.e. Print out something.
            It was a one liner.
            We always want to do the "modifying" after we finish doing all our work.
            This is because we want to do work on good values.
            And the way we check for good values is the condition.

            The modifier code will change the value for the condition check.
            But unless it's been checked, we don't know if it's good.

            We saw this in the textbook example.
            int n = 0;
            int square = 0;

            while (square < 100) {
                // Do work
                System.out.println(square);

                // Modify
                n++;
                square = n * n;
            }

            The goal of the modifier code is to push the boolean condition into a "false" state.
            If we did the modifying before the "work" part, we would get most of the "right answers"
            but the last time we do the loop


            You asked the question "How do I know what number to put in at the start?"
            The succinct answer is the number you need for your first value to do the work on.

            For the square example, the first number you want to do work on is 0 which is 0 * 0.
            So we choose 0 as our starting number for square.

            Or if you prefer to keep everything as unevaluated expressions, you can use:
            int square = n * n;
            This lets the computer calculate the starting value of "square" for you.

         */

        // Try these
        exercise7();
        exercise8();
    }


    /**
     * TODO: Never say never
     *
     * Write a while loop.
     * The condition is the value: false.
     * The code block should print out the word "Never". It should never run.
     */
    public static void exercise1() {

    }

    /**
     * TODO: Never say never 2
     *
     * Create a variable called shouldSayNever. Set it to false.
     * Write a while loop.
     * Set the condition to shouldSayNever
     * The code block should print out the word "Never". It should never run.
     */
    public static void exercise2() {

    }

    /**
     * TODO: Forever and ever
     *
     * Write a while loop.
     * The condition is the value: true.
     * The code block should print out the word "Forever and ever".
     * Run the code. It should run forever.
     * Comment out the code.
     */
    public static void exercise3() {

    }

    /**
     * TODO: Forever and ever 2
     *
     * Create a variable called shouldStayTogether. Set it to true.
     * Write a while loop.
     * Set the condition to shouldStayTogether
     * The code block should print out the word "Forever and ever".
     * Run the code. It should run forever.
     * Comment out the code.
     */
    public static void exercise4() {

    }

    /**
     * TODO: Train
     *
     * The train can only hold 100 passengers.
     * It starts off with 20 passengers.
     * Every station it pick up another 10 passengers.
     * Write a while loop that prints out: "Still got space" As long as the train has space for passengers
     *
     * Create a variable called passengerCount. Set it to 20.
     * Write a while loop.
     * Set the condition to passengerCount < 100
     * The code block should print out the word "Still got space"
     * Inside the code block, modify the passengerCount variable to add in 10 more passengers.
     */
    public static void exercise5() {

    }

    /**
     * TODO: Bacteria
     *
     * Bacteria grows exponentially.
     * Every five minutes, a certain bacteria splits into two.
     * Once it grows to 300 bacteria count, it is deemed unsafe.
     * Write a while loop that prints out "Safe" until the bacteria hits 300.
     *
     * Create a variable called bacteriaCount. Set it to 5.
     * Write a while loop.
     * Set the condition to bacteriaCount < 1000
     * The code block should print out the word "Safe"
     * Inside the code block, modify the bacteriaCount variable to double its count.
     */
    public static void exercise6() {

    }


    /**
     * TODO: Train 2
     *
     * The train can hold up to and including 100 passengers.
     * It starts off with 20 passengers.
     * Every station it pick up another 10 passengers.
     * Write a while loop that prints out: "Still got space" As long as the train has space for passengers
     *
     * Create a variable called passengerCount. Set it to 20.
     * Write a while loop.
     * Set the condition to passengerCount < 100
     * The code block should print out the word "Still got space"
     * Inside the code block, modify the passengerCount variable to add in 10 more passengers.
     *
     * New: Add one more line of "work" to this code to print out the passenger count.
     * We only want to print it out if the passengers get on.
     * Printing out "110" is wrong.
     */
    public static void exercise7() {

    }

    /**
     * TODO: Bacteria 2
     *
     * Bacteria grows exponentially.
     * Every five minutes, a certain bacteria splits into two.
     * Once it grows to 300 bacteria count, it is deemed unsafe.
     * Write a while loop that prints out "Safe" until the bacteria hits 300.
     *
     * Create a variable called bacteriaCount. Set it to 5.
     * Write a while loop.
     * Set the condition to bacteriaCount < 1000
     * The code block should print out the word "Safe"
     * Inside the code block, modify the bacteriaCount variable to double its count.
     *
     * New: Add one more line of "work" to this code to print out the bacteria count.
     * We only want to print out if the bacteria colony is safe.
     */
    public static void exercise8() {

    }

}
