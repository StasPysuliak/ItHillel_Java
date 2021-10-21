package home.work2.lesson;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestInTheArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int co = scanner.nextInt();

        int[] arr1 = readIntegers(co);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("min = " + findMin(arr1));
    }

    static int[] readIntegers(int cout) {
        int[] arr = new int[cout];
        for (int i = 0; i < cout; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    static int findMin(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        Arrays.toString(mas);
        return mas[0];
    }
}
