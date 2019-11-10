package exercises.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {
        // 1. Array creation: Create an empty array of integers size 5
        //    Call the array tally
        int[] arrayTally = new int[5];

        // 2. Print: Print it out and check if it spits out the default
        String output = Arrays.toString(arrayTally);
        System.out.println(output);
        System.out.println(Arrays.toString(arrayTally));

        // 3. Random numbers: Generate random numbers between [0 - 4].
        //    We will use a for loop to generate 5 separate numbers
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumbers = random.nextInt(5);
            System.out.print(randomNumbers + ", ");
            arrayTally[i] = randomNumbers;
            System.out.println(Arrays.toString(arrayTally));
        }






        // 4. Modification: Whatever random number you have "r",
        //    increment the tally
        //    Every time you modify the array, print out the array to show your progress onto the screen.
    }

}
