package home.work2.lesson;

import java.util.Arrays;

public class AscendingSequence {
    public static void main(String[] args) {

        int[] arr = new int[40];
        double a;
        for (int i = 0; i < 40; i++) {
            a = 10 + Math.random() * 89;
            arr[i] = (int) a;
        }
        System.out.println(Arrays.toString(arr));

        boolean seq = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                seq = false;
                break;
            }
        }
        if (seq) System.out.println("sequence");
        if (!seq) System.out.println("no sequence");
    }
}
