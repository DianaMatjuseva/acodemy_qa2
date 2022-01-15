package classroom;

import java.util.Arrays;

public class PracticeConsultation {

    public static void main(String[] args) {

        int[] a = {1, 4, 6, 8, 10};
        int[] b = {3, 5, 9, 1, 0};
        int[] c = {12, 1, 5, 15, 17};

        int[] array = new int[a.length];

        // int[] array = new int[5];

        int index = 0;

        // array[0] = 1;
        // {0, 0, 0, 0, 0}
        // {1, 0, 0, 0, 0}
        // array[index] + 1;

        for (int aNum : a) {
            for (int bNum : b) {
                for (int cNum : c) {
                    if (aNum == bNum && bNum == cNum) {
                        System.out.println("Match!");
                    }
                }
            }
        }

        for (int numberFromFirstArray : a) {
            for (int numberFromSecondArray : b) {
                for (int numberFromThirdArray : c) {
                    if(numberFromFirstArray == numberFromSecondArray && numberFromSecondArray == numberFromThirdArray);
                    array[index] = numberFromFirstArray;
                    index++;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
