package challenges;

public class LeetCode01 {

    public static void main(String[] args) {
        int[] intergerArray = new int[]{4, 7, 13, 21, 32, 7, 9 ,10, 4567};
        //2 numbers in this add to 34
        for (int i = 0; i < intergerArray.length; i++) {
            for (int j = i + 1; j < intergerArray.length; j++) {

                if (intergerArray[i] + intergerArray[j] == 34) {
                    System.out.printf("%d, %d, winner ", intergerArray[i], intergerArray[j]);

                }
            }

        }
//
//        for (int j = 0; j < 4; j++) {
//            if (intergerArray[j] + intergerArray[1] == 34) {
//                System.out.printf("%d, %d, winner ", intergerArray[j], intergerArray[1]);
//            }
//
//        }
//        for (int k = 0; k < 4; k++) {
//            if (intergerArray[k] + intergerArray[2] == 34) {
//                System.out.printf("%d, %d, winner ", intergerArray[k], intergerArray[2]);
//
//            }
//        }
//        for (int m = 0; m < 4; m++) {
//            if (intergerArray[m] + intergerArray[3] == 34) {
//                System.out.printf("%d, %d, winner ", intergerArray[m], intergerArray[3]);
//
//            }
//        }
//        for (int n = 0; n < 4; n++) {
//            if (intergerArray[n] + intergerArray[4] == 34) {
//                System.out.printf("%d, %d, winner ", intergerArray[n], intergerArray[4]);
//
//            }
//        }
    }
}