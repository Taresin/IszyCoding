package samples;

import java.util.Arrays;

public class ArraySample {
    public static void main(String[] args) {
        // An array looks like this "[]"
        int[] integerArray = new int[9];
        int[] integerArrayTwo = new int[5];

        // There's an easy way to print an array
        String output = Arrays.toString(integerArray);

        // If we print it out, then we will see the default values
        System.out.println(output);
        System.out.println(Arrays.toString(integerArrayTwo));

        // If you already know what's supposed to be inside the array,
        // you can type it in directly inside "{  }"
        int[] customArray = new int[]{3, 6, 15, 9, 7, 5};
        System.out.println(Arrays.toString(customArray));

        // If you want to see what's inside a particular pigeon hole
        int number = customArray[2];
        System.out.println(number); // should be 15

        // If you want to modify a particular pigeon hole
        customArray[2] = 7;
        System.out.println(Arrays.toString(customArray));

        // If you want to print the first 3 numbers
        System.out.printf("%d, %d, %d\n", customArray[0], customArray[1], customArray[2]);

        // If you want to add a few of them, you can call the pigeon holes
        System.out.println(customArray[0] + customArray[2]);

        // You can modify the array just like you would with a storage box of the same type.
        // So for an int array, you can do anything ints can do:
        customArray[0] = customArray[0] + 6;
        customArray[1]++;
        customArray[3] -= 7;

        // If you want to use them in if statements, you can use them just like a variable
        // Variable version
        int x = 7;
        if (x == 7) {
            System.out.println("Winner");
        }

        // Array version
        if (customArray[3] == 7) {
            System.out.println("Winner");
        }



        // Beware: if you try to reference a pigeon hole that doesn't exist,
        // you will get a crash
        // "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 14"
        // System.out.println(customArray[14]); // Commented out otherwise code after this will not run
                                                // Uncomment this to see this line in action

        // You can find out how long the array is using this:
        int arrayLength = customArray.length;

        // Now you can use this in a loop to print everything out
        System.out.println("Loop printing");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(customArray[i] + " ,");
        }
        System.out.println();


        // So now that you know int arrays, you can use any object type you like.
        // e.g. boolean, String, double
        String[] nameList = new String[]{"Iszy", "Dougy", "Jono", "Jojo"};

        // Arrays are good for keeping a certain structure for places.
        // E.g. Soccer team comp winners

        String[] winnersList = new String[3]; // This array can represent 1st, 2nd and 3rd place
        // String[] winnersList = new String[] {" ", " ", " "}; // If you wanted this to look a little nicer

        // This is useful when you don't know who the winner is yet.
        System.out.println(Arrays.toString(winnersList));

        winnersList[2] = "Manchester"; // We know who 3rd place is but 1st and second are still fighting
        System.out.println(Arrays.toString(winnersList));

        // Results are in for finals
        winnersList[0] = "Liverpool";
        winnersList[1] = "Real Madrid";
        System.out.println(Arrays.toString(winnersList));

    }
}
