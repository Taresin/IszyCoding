package exercises.textbook;

public class R4_1 {
    public static void main(String[] args) {
        /*
        All squares less than n. For example, if n is 100, print 0 1 4 9 16 25 36 49 64 81.

         */

        //int*int
//        int n = 100;
//        int k = 0;
//
//        int square = 0;
//
//        while (square < n) {
//            square = k * k;
//            k++;
//            System.out.println(square);
//        }

        int n = 0;
        int square = 0;

        while (square < 100) {
            System.out.println(square);
            n++;
            square = n * n;
        }

    }

}
