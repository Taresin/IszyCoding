package samples.controlstructures;

public class ForLoopDemo {
    public static void main(String[] args) {

        System.out.println("One at a time");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("2 at a time");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("2^n at a time");
        for (int i = 1; i < 100; i *= 2) {
            System.out.println(i);
        }


        int[] array = {10, 4, 5, 19, 7, 125};
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Dynamic length");
        int[] array2 = {10, 4, 5, 19, 7, 125, 129, 500};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
