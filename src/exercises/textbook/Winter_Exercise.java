package exercises.textbook;

import java.util.Scanner;

public class Winter_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt month
        System.out.println("What month are we in?");
        int userMonth = scanner.nextInt();

        //prompt day
        System.out.println("What day is it?");
        int userDay = scanner.nextInt();

        String season = "";

        if (userMonth == 1 || userMonth == 2 || userMonth == 3) {
            season = "Winter";
        } else if (userMonth == 4 || userMonth == 5 || userMonth == 6) {
            season = "Spring";
        } else if (userMonth == 7 || userMonth == 8 || userMonth == 9) {
            season = "Summer";
        } else if (userMonth == 10 || userMonth == 11 || userMonth == 12) {
            season = "Fall";
        }

        if (userMonth % 3 == 0 && userDay >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else if (season.equals("Spring")) {
                season = "Summer";
            } else if (season.equals("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }


        }
        System.out.println("The season is = " + season);

    }

}

