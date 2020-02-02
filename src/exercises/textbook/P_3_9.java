package exercises.textbook;

public class P_3_9 {
    public static void main(String[] args) {
        /*

        Write a program that reads a temperature value and the letter C for Celsius or F for Fahrenheit.
        Print whether water is liquid, solid, or gaseous at the given temperature at sea level.

        water can exist as a solid (ice, temperature < 0 degrees Celcius),
        liquid (water, temperature between 0 degrees Celcius and 100 degrees Celcius), and
        gas (water vapor, temperature > 100 degrees Celcius).
         */
        int C = 35;

        if (C < 0){
            System.out.println("Solid");
        }
        else if (C < 100){
            System.out.println("liquid");
        }
        else {
            System.out.println("gas");
        }
    }
}
