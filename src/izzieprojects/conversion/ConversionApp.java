package izzieprojects.conversion;

import java.util.Scanner;

public class ConversionApp {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double pounds = 2;
        double grams = ConversionUtils.poundsToGrams(pounds) ;
        System.out.println(grams);

        double sticks = 6;
        double grams2 = ConversionUtils.stickToGrams(sticks);
        System.out.println(sticks);

        double teaspoon = 4;
        double mls = ConversionUtils.teaspoonToMls(teaspoon);

        double tablespoon = 8;
        double tablespoonMls = ConversionUtils.tablespoonToMls(tablespoon);

        double ounces = 4;
        double ounceGrams = ConversionUtils.ouncesToGrams(ounces);


        System.out.println("How much butter do you have?");
        double inputDouble = scanner.nextDouble();
//        double answer = ConversionUtils.stickToGrams(inputDouble);
//        System.out.printf("You have %f grams of butter", answer);

        System.out.println("What units is this?");
        String units = scanner.next();
        if (units.equals("lb")) {
            double answer = ConversionUtils.poundsToGrams(inputDouble);
            System.out.printf("You have %f grams", answer);
        } else {
            System.out.println("I don't have a conversion function for you. Fuck off");
        }
    }

}
