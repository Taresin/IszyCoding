package dougyuni;

import java.util.Scanner;

public class DougyLoops {
    public static void main(String[] args) {


        user();


    }

    public static void q1() {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void q2() {
        for (int i = 0; i < 11; i++) {
            System.out.print(i);
            /*for (int j = 2; j <21; j+=2){
                System.out.print(j);
            }*/
        }

    }

    public static void q3() {
        for (int line = 0; line <= 5; line++) {
            for (int i = 5; i > line; i--) {
                System.out.print(i);

            }
            System.out.println();
        }


    }

    public static void q4() {
        for (int line = 0; line <= 5; line++) {
            for (int i = 0; i < line; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void dougy1() {
        for (int line = 1; line <= 10; line++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print(line * col + " ");
            }
            System.out.println();
        }
    }

    public static void user() {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 0;
        int studentScore = 0;
        int studentMaxScore = 0;
        int studentMinScore = Integer.MAX_VALUE;
        //int average = studentScore/studentCount;
        while (true) {
            printStatement("Please enter course results");
            int newScore = scanner.nextInt();
            if (newScore == -1){
            break;}

            studentCount++;
            studentScore = studentScore + newScore;
            if (newScore > studentMaxScore) {
                studentMaxScore = newScore;
            }
            if (newScore < studentMinScore) {
                studentMinScore = newScore;
            }



        }
        int average = studentScore/studentCount;
        System.out.println("Average = " + average);
        System.out.println("Max score =" + studentMaxScore);
        System.out.println("Min score =" + studentMinScore);


    }

    public static void printStatement(String statement) {
        System.out.println(statement);
    }
}
