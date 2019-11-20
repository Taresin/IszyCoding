package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {
//        // 1. Array creation: Create an empty array of integers size 5
//        //    Call the array tally
//        int[] arrayTally = new int[5];
//
//        // 2. Print: Print it out and check if it spits out the default
//        String output = Arrays.toString(arrayTally);
//        System.out.println(output);
//        System.out.println(Arrays.toString(arrayTally));
//
//        // 3. Random numbers: Generate random numbers between [0 - 4].
//        //    We will use a for loop to generate 5 separate numbers
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            int randomNumbers = random.nextInt(5);
//            System.out.print(randomNumbers + ", ");
//            arrayTally[i] = randomNumbers;
//            System.out.println(Arrays.toString(arrayTally));
//        }
//
//
//        // 4. Modification: Whatever random number you have "r",
//        //    increment the tally
//        //    Every time you modify the array, print out the array to show your progress onto the screen.
//        initializationIntro();

        accessEx2();
        accessEx3();
        accessEx4();

        accessEx5(new int[]{0, 2, 3});
        accessEx5(new int[]{0});
        accessEx5(new int[]{0, 2, 3, 7, 2});

        accessEx6(new int[]{0, 2, 3});
        accessEx6(new int[]{0});
        accessEx6(new int[]{0, 2, 3, 7, 2});

        accessEx7(new String[]{"Little Peter Rabbit", "Twinkle Twinkle", "Humpty Dumpty"});
        accessEx7(new String[]{"Shape of You", "Castle on a Hill", "Roxanne", "Around the World", "The Logic Song", "Drops of Jupiter"});
        accessEx7(new String[]{"Bohemian Rhapsody"});

        accessEx8(new int[]{19, 23, 22});
        accessEx8(new int[]{19, 26, 18, 19, 10});
        accessEx8(new int[]{19, 26, 15, 19});

        accessEx9(new int[]{700, 550, 230});
        accessEx9(new int[]{190, 400, 780, 800, 540});
        accessEx9(new int[]{900, 200, 420, 420});
    }

    public static void initializationIntro() {
        /**
         * Arrays
         *
         * Arrays are things we can use to hold pieces "data" together.
         *
         * It's useful to imagine arrays as pigeon holes:
         * [ ] [ ] [ ] [ ]
         *
         * These pigeon holes are given numbers starting from zero:
         * [0] [1] [2] [3] [4] ....
         *
         */

        /**
         * Initialization
         * To get an array up and running there are a couple of different ways:
         */

        // This is an array of 3 pigeon holes. You can put any number here.
        // Right now there is nothing stored in the pigeon holes.
        // Normally these will have null if you look inside the pigeon hole.
        // However, "primitives" are special. They cannot be null so they have a default value.
        // int defaults to zero so the pigeon holes in the array below look like this:
        // [ 0 ] [ 0 ] [ 0 ]
        int[] array1 = new int[3];

        // You can also fill in the numbers directly into an array.
        int[] array2 = {3, 15, 28, 7};

        /**
         * Usage
         */

        /**
         * Printing
         * This is how you can print an array
         */
        System.out.println(Arrays.toString(array2));
    }


    /*
        Practice Initializing arrays
     */

    /**
     * Create an array of size 2 pigeon holes.
     */
    public static void initialisationEx1() {
        int[] array = new int[2];

    }

    /**
     * Create an array of size 5 pigeon holes.
     */
    public static void initialisationEx2() {
        int[] array = new int[5];

    }

    /**
     * Create an array with the numbers 2, 4, 6, 8, 10.
     */
    public static void initialisationEx3() {
        int[] array = {2, 4, 6, 8, 10};

    }

    /**
     * Create an array of size 3 pigeon holes.
     * Each of these holes should have one piece of your birthday.
     * i.e.
     * [14] [5] [1993]
     */
    public static void initialisationEx4() {
        int[] arrayBday = {17, 2, 1990};
    }


    public static void dataTypesIntro() {

        /**
         * Working with other data types
         *
         * Arrays do not have to be integers.
         * They can be arrays of any type of "thing"
         * We can have arrays of the primitives like: int, boolean, float, double...
         * We can also have arrays of classes like: String, Tuna, Cake
         *
         * The important part to remember is that the "[]" part of int[] mean that it's an array.
         */
        int[] intArray = new int[5];
        boolean[] booleanArray = new boolean[13];
        String[] stringArray = new String[25];

        /**
         * Just like int, you can initialize them using the "{ }" notation
         */

        int[] intArray2 = {4, 5, 6};
        boolean[] booleanArray2 = new boolean[]{true, true, false};
        String[] stringArray2 = new String[]{"Tahlia", "Sophia", "Harry"};
    }


    /**
     * Create an array of doubles of size 3
     */
    public static void initializationEx5() {
        double[] size3 = new double[3];

    }

    /**
     * Create an array of Strings of size 7
     */
    public static void initializationEx6() {
        String[] string7 = new String[7];

    }

    /**
     * Create an array of doubles with the numbers 3.14, 9.81, 37
     */
    public static void initializationEx7() {
        double[] doublePie = new double[]{3.14, 9.81, 37};

    }

    /**
     * Create an array of 4 puppy names of your choice
     */
    public static void initializationEx8() {
        String[] puppyNames = {"Samson", "LOL", "Teacup", "Lucky"};

    }

    /**
     * I've created a class called Cake for the next exercises
     * To create a cake, it takes in a string to represent the type of cake
     * <p>
     * e.g. new Cake("sponge"), or new Cake("tiramisu")
     */

    static class Cake {
        String type;

        public Cake(String type) {
            this.type = type;
        }
    }

    /**
     * Create an empty array of 3 cakes.
     */
    public static void initializationEx9() {
        Cake[] menu = new Cake[3];


    }

    /**
     * Create an array of 3 cakes and fill them up with the cakes of your choice.
     */
    public static void initializationEx10() {

        /**
         * As a refresher on how to create new objects.
         * We can create three different cake objects here
         */
        Cake dadsCake = new Cake("tiramisu");
        Cake mumsCake = new Cake("blackforest");
        Cake jonosCake = new Cake("banana");

        /**
         * We then put the cake objects into a "list"
         */
        Cake[] cakesOrders = {dadsCake, mumsCake, jonosCake};

        /**
         * The example above gives meaning to each cake.
         * But if you don't need to keep the reference to the cakes,
         * you can just shove the object into the array by itself
         */
        Cake[] menu = new Cake[]{
                new Cake("   "),
                new Cake("two"),
                new Cake("three")
        };

    }

    public static void accessIntro() {
        /**
         * To refer to any element in the array, you use the [x] notation.
         * Remember, the pigeon holes start counting from zero.
         *
         * [0] [1] [2] [3] [4]
         */
        int[] lotteryNumbers = {2, 6, 19, 17, 22, 29};
        int firstNumber = lotteryNumbers[0];
        int thirdNumber = lotteryNumbers[2];

        /**
         * Little trick: you can get the last element by using this function
         */
        int sizeOfDraw = lotteryNumbers.length; // <-- This gives 6

        /**
         * If we want the last number the boxes here are:
         * [0] [1] [2] [3] [4] [5]
         *
         * Because we start counting from 0, the index of the last number is always one less than the size of the array.
         * So you will see this a lot:
         */
        int lastNumber = lotteryNumbers[sizeOfDraw - 1];

        /**
         * Each pigeonhole in an array Is given a number.
         *  We call this the index.
         *  The indices of an array are always chronological starting from zero.
         *  This means if we generate all the numbers from zero to the size of the array,
         *  we can reference each of the items in the array
         *
         *  A simple way to generate the numbers is using a for loop
         *  This piece of code below, goes through the numbers in a Forward direction
         *  This is because the numbers are counting up
         */
        for (int currentIndex = 0; currentIndex < lotteryNumbers.length; currentIndex++) {
            int currentNumber = lotteryNumbers[currentIndex];
            System.out.println("currentNumber = " + currentNumber);
        }

        /**
         * This piece of code below, goes to the numbers in backward direction
         * This is because the numbers are counting down
         */
        for (int currentIndex = lotteryNumbers.length - 1; currentIndex >= 0; currentIndex++) {
            int currentNumber = lotteryNumbers[currentIndex];
            System.out.println("currentNumber = " + currentNumber);
        }
    }

    /**
     * Initialize an array with the numbers 3, 5, 7, 9
     * Now access the third element in the array (7)
     * We will store it as a variable called `thirdItem`
     * Use sout to print out thirdItem
     */
    public static void accessEx1() {
        int[] array = {3, 5, 7, 8};
        int thirdItem = array[2];

        System.out.println(thirdItem);
    }

    /**
     * Initialize an array with the names of 3 uni students.
     * Now access the last element in the array
     * We will store it as a variable called `lastStudent`
     * Use sout to print out lastStudent
     */
    public static void accessEx2() {
        String[] arrayNames = new String[]{"Doug", "Mike", "Jenny", "Carl"};
        System.out.println(arrayNames[3]);
    }

    /**
     * Initialise an array with the names of three uni students
     * Access the last element based off the Array length
     */
    public static void accessEx3() {
        String[] arrayNames = new String[]{"Doug", "Mike", "Jenny", "Carl"};
        int sizeOfString = arrayNames.length;
        int lastStudentBoxNumber = sizeOfString - 1;
        String lastStu = arrayNames[lastStudentBoxNumber];
        System.out.println(lastStu);
    }

    /**
     * Initialise an array with the names of three items on the McDonald's menu.
     * John orders the last item on the menu every time.
     * Stacey orders the second last Item on the menu every time.
     * <p>
     * Create a variable called orderJohn To store John's order
     * Create a variable called orderStacey To store Stacey's order
     * <p>
     * Print out orderJohn and orderStacey
     */
    public static void accessEx4() {
        String[] menuItems = new String[]{"Big mac","Cheeseburger","hashbrown"};
        int sizeOfMenu = menuItems.length;


        int lastBoxNo = sizeOfMenu - 1;
        int secondLastOrder = sizeOfMenu - 2;
        String orderJohn = menuItems [sizeOfMenu - 1];
        String orderStacey = menuItems [sizeOfMenu - 2];
        System.out.println(orderJohn);
        System.out.println(orderStacey);

    }

    /**
     * Parameters - Size Check
     *
     * You might not see the need to refer to the last items in an array right now because
     * you know the index of each item since you created the array yourself.
     *
     * In this exercise, you will not be doing the initialization of the array.
     * Someone else will do it and give it to you as a parameter.
     *
     * You're given an array (givenArray) as the parameter in the function.
     * This can be of any size.
     * e.g.
     * • [2] [5]
     * • [3] [1] [3] [2]
     * • [5] [4] [8]
     *
     * Use the ".length" property of arrays to find out how long the array is.
     * Print out the size of the array.
     *
     */
    public static void accessEx5(int[] givenArray) {

    }

    /**
     * Parameters - Printing arrays
     *
     * You will be given an array as a parameter.
     * Loop through each item in the array and print it.
     *
     * This function will be run three times with different sized arrays
     */
    public static void accessEx6(int[] givenArray) {

    }

    /**
     * Great! You are doing very good.
     * For this next exercise, we will be creating function that will Pretend to download lists of songs
     * That are given to us by a user.
     *
     * We have three users that Want to download songs Using your function.
     * i.e. This function will be run three times with different sized arrays
     *
     * The song names are provided to you As a Parameter in the function called givenSongs
     * For each of the given songs, print out onto the screen "Downloaded <Song Name>"
     */
    public static void accessEx7(String[] songArray) {

    }

    /**
     * ID checking
     * You are given an array of integers representing the ages of students entering club
     * Loop through each of the ages to find out if any of the students are underage (< 18)
     *
     * If you find underage student, print it out "Access denied".
     * You have three groups of students lining up. Therefore, this function will be run three times.
     */
    public static void accessEx8(int[] ageArray) {

    }

    /**
     * Rental Income
     *
     * You are given an array of integers representing the rental income of various properties that you own per week.
     * Loop through each of the items and add them together.
     * You will need a variable to keep track of how much you have counted up to.
     */
    public static void accessEx9(int[] rentArray) {

    }

    public static void modificationIntro() {
        /**
         * We can modify the array with this:
         */
        int[] familyAges = {27, 32, 54, 78}; // <-- initialize
        familyAges[0] = 28; // <-- changes the first element (27) to 28

        /**
         * Now the array looks like this:
         * [28] [32] [54] [78]
         */

        /**
         * Note:
         *
         * Arrays let you modify the contents inside the pigeon holes.
         * However, you cannot change the number of pigeon holes after you initialize it.
         */

        /**
         * You can combine the two concepts you just learnt "modification" with "access"
         * so you can change the value based on values already in the array.
         *
         * For example, keeping track of how much money each player has in a monopoly game
         */
        int[] monopolyMoney = {500, 800, 620, 1750};

        // Let's say we need to update the money because, Player 2 bought a new property for $200
        // You can read this as:
        // [Player 2's money] = [Whatever money Player 2 has right now] - [Cost of property]
        monopolyMoney[1] = monopolyMoney[1] - 200;

        // Let's say we need to update the money because, Player 4 needs to pay Player 1 10% of everything they own.
        monopolyMoney[0] = monopolyMoney[0] + monopolyMoney[3] / 10;
        monopolyMoney[3] = monopolyMoney[3] - monopolyMoney[3] / 10;

        // We can see "monopolyMoney[3] / 10" is used a couple of times
        // so we can store it in a variable instead of writing out the equation many times.
        int debt = monopolyMoney[3] / 10;
        monopolyMoney[0] = monopolyMoney[0] + debt;
        monopolyMoney[3] = monopolyMoney[3] - debt;
    }

    /**
     * Birthday
     *
     * We have given you array of integers representing the ages of members of one family.
     * It is the fourth member's birthday today.
     *
     * Update this members age
     */
    public static void modificationEx1(){
        int[] familyAges = {27, 32, 54, 78};
    }

    /**
     * Ping Pong Scores
     *
     * You are given an array to keep track of ping pong scores for the two players
     * Player 2 just scored a point.
     * Update the array
     */
    public static void modificationEx2() {
        int[] pingPongScores = { 17, 5 };

    }

    /**
     * Ping Pong Scores v2
     *
     * Same as previous but now you don't know the numbers so you can't hard code it.
     *
     * You are given an array to keep track of ping pong scores for the two players
     * Player 2 just scored a point.
     * Update the array
     */
    public static void modificationEx3(int[] pingPongScores) {


    }

    /**
     *
     */
    public static void modificationEx4(int[] pingPongScores) {


    }
}
