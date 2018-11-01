package samples;

/**
 * Created by dougylee on 1/11/18.
 */
public class WhileLoop {

    public static void main(String[] args) {

        // Example 1. While loop
        // Go through each number from 1 to 10
        System.out.println("Example 1. While loop");
        System.out.println("Go through each number from 1 to 10");
        int i1 = 1; // Part 1. Initialize the starting number
        while (i1 <= 10) {  // Part 2. Write the condition. (We will keep changing i. Do this code while i is less than 100)

            // Part 4. Insert any code here.
            System.out.println(i1);

            i1++;  // Part 3. Modify i. Eventually you will break the condition and we can get out of this loop
        }


        // Example 2. Continue (Skip this turn)
        // Skip multiples of 3
        System.out.println("Example 2. Continue (Skip this turn)");
        System.out.println("Skip multiples of 3");
        int i2 = 1;
        while (i2 <= 10) {

            if (i2 % 3 == 0) {
                i2++;       // Need to modify otherwise we'll keep coming back
                continue;   // Skip the rest of the code and go straight to the condition check
            }

            System.out.println(i2);
            i2++;
        }


        // Example 3. Break (Stop looping)
        // Break the loop when you hit halfway
        System.out.println("Example 3. Break (Stop looping)");
        System.out.println("Break the loop when you hit halfway");
        int i3 = 1;
        int max = 10;
        while (i3 <= max) {

            if (i3 > max / 2) {
                break;
            }

            System.out.println(i3);
            i3++;
        }
    }

}
