package samples;

import java.util.Random;

/**
 * Created by dougylee on 1/11/18.
 */
public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();

        // Get a random number from ALL the integers
        int randomNumber1 = random.nextInt();
        System.out.println(randomNumber1);

        // Get a random number up from 0 to 9
        int randomNumber2 = random.nextInt(10) ;
        System.out.println(randomNumber2);

        // Get a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);
    }

}
