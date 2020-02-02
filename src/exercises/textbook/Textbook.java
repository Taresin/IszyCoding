package exercises.textbook;

import java.util.Scanner;

public class Textbook {
    public static void main(String[] args) {
        int area = 36;
        double length = Math.sqrt(area);
        System.out.println(length);

        double radius = 14;
        double volume = (4 * Math.PI * Math.pow(radius,3))/3;
        System.out.println(volume);

        int value = 24;
        int answer = (value/10) % 10;
        System.out.println(answer);

        double s0 = 5;
        double v0 = 10;
        double t = 2;
        double g = 9.8;

        double s = s0 + (v0 * t) + (g * Math.pow(t,2)/2);
        System.out.println(s);

        double a = 2;
        double p = 3;
        double m1 = 2;
        double m2 = 3;

        double G = ((4 * Math.pow(Math.PI,2) * Math.pow(a, 3))/ (Math.pow(p,2) * (m1 + m2)));
        System.out.println(G);

        double PV = 3;
        double INT = 2.3;
        int YRS = 4;

        double FV = PV * Math.pow((1 + INT/100), YRS);
        System.out.println(FV);

        double a1 = 2;
        double b = 4;
        double y = 3;

        double c = Math.sqrt(Math.pow(a1,2) + Math.pow(b,2) - (2 * a1 * b * Math.cos(y)));
        System.out.println(c);

        double rectLength = 11;
        double rectWidth = 8.5;

        double perimeter = (2*rectLength) + (2* rectWidth);
//        double diagonalLength = (Math.sqrt((Math.pow(rectLength,2)) + (Math.pow(rectWidth,2))));
        double diagonalLength = Math.sqrt((rectLength * rectLength) + (rectWidth * rectWidth));
        System.out.println(perimeter);
        System.out.println(diagonalLength);

        int j = 2;
        int p2 = 4;

        int sum = p2 + j;
        System.out.println(sum);

        int difference = j - p2;
        System.out.println(difference);

        int product = p2 * j;
        System.out.println(product);

        int average = product/2;
        System.out.println(average);

        int distance = Math.abs(difference);
        System.out.println(distance);

        int max = Math.max(j,p2);
        System.out.println(max);

        int min = Math.min(j, p2);
        System.out.println(min);

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("what is your age? ");
        int userAge = scanner.nextInt();*/

        int volume1 = 10;
        System.out.printf("The volume is %5d\n", volume1);

        String name = "jave program";
        int  nameLength= name.length();
        System.out.println(nameLength);
        String firstWord = name.substring(0,4);
        char firstWord2 = name.charAt(2);
        System.out.println(firstWord2);

        /*System.out.println(firstWord);
        String secondWord = name.substring(5,12);
        System.out.println(secondWord);
        String wholeWord = name.substring(0);
        System.out.println(wholeWord);
        System.out.println(firstWord + nameLength); */

        String str = "Java Program";
        String gram = str.substring(8);
        System.out.println(gram);
        String q28 = str + "ing";
        System.out.println(q28);

        String plusMinus = "+--+--+--+";
        String line = "|  |  |  |";

      /*  System.out.println(plusMinus);
        System.out.println(line);
        System.out.println(plusMinus);
        System.out.println(line);
        System.out.println(plusMinus);
        System.out.println(line);
        System.out.println(plusMinus); */


        for (int i = 0; i < 3; i++) {
            System.out.println(plusMinus);
                System.out.println(line);


        }
        System.out.println(plusMinus);

        String numbers = "0123456789";
        String areaCode = numbers.substring(0,3);
        String middleNumbers = numbers.substring(3,6);
        String lastNumbers = numbers.substring(6);

       // System.out.printf(areaCode  + " " + middleNumbers + "-" + lastNumbers );


        System.out.printf("(%s) %s-%s\n", areaCode, middleNumbers, lastNumbers );














    }

    public static double getArea(int area) {
        return 4.0;
    }
}
