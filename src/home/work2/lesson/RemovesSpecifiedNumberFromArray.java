package home.work2.lesson;

import java.util.Arrays;

public class RemovesSpecifiedNumberFromArray {
    public static void main(String[] args) {

        int a = 3;
        int count = 0;
        int j = 0;
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};

        for (int i = 0; i < 8; i++) {
            if (arr[i] == a) {
                count++;
            }
        }

        int[] arr1 = new int[arr.length - count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) arr1[i - j] = arr[i];
            else j++;

        }

        System.out.println(Arrays.toString(arr1));

    }
}
