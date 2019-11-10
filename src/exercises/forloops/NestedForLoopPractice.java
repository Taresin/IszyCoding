package exercises.forloops;

public class NestedForLoopPractice {
    // You have a 3 digit password to crack.
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    // Write a for loop that prints out the numbers between 0 and 9
    // i.e. one digit combinations
    public static void exercise1() {
       for (int i = 0; i < 10; i++){
            //System.out.println(i);
        }

    }

    // Write out a nested for loop that prints out two digit combinations
    public static void exercise2() {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d, %d\n",i, j);
            }
        }
    }

    // Write out nested loops for all 3 digit combinations
    public static void exercise3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int d = 0; d < 10; d ++)
                System.out.printf("%d, %d, %d\n", i, j,d);
            }
        }
    }

}
