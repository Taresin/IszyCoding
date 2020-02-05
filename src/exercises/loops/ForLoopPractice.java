package exercises.loops;

public class ForLoopPractice {

    public static void main(String[] args) {

        // For Loop print 1 - 10 (forwards)

        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        // For Loop print 10 - 1 (backwards)
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // For Loop print 1, 3, 5, 7, 9 (skip)
        for (int i = 1; i < 10; i=i+2) {
            System.out.println(i);
        }

        // For Loop with if condition (if multiple of 3, print out)
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 ){
                System.out.println(i);
            }
        }

        // Nested For loops
        for (int mainPoint = 1; mainPoint < 4; mainPoint++) {
            System.out.printf("%d.\n", mainPoint);
            for (int subPoint = 1; subPoint < 4; subPoint++) {
                System.out.printf("    %d)\n", subPoint);
            }
        }



    }

}
