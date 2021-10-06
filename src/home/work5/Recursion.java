package home.work5;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        System.out.println("Write the number of elements of the array");
        int size = correctNumber();
        int[] arr = new int[size];

        System.out.println("Please write the elements of the array as in the example: 4 2 4 8 6 3 2");
        for (int i = 0; i < size; i++) {
            arr[i] = correctNumber();
        }

        System.out.println("Write the number as in the example: 574");
        int number = correctNumber();
        int counter = 0;
        String str = String.valueOf(number);


        System.out.println("Sum of the elements of the array: " + arrSum(arr, counter));
        System.out.println("The maximum value in the set array: " + maxValue(arr, counter));
        System.out.println("The sum of the digits of a given number: " + sumOfNumber(number));
        System.out.println("Number in reverse order: " + flipTheNumber(str));
    }

    private static int correctNumber() {                            //check the entered number
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) number = scanner.nextInt();
        else {
            System.out.println("Wrong argument.Please enter a number");
            System.exit(0);
        }
        return number;
    }

    private static int arrSum(int[] arr, int i) {                   //find the sum of the elements of the array
        if (i >= arr.length) return 0;
        return arr[i++] + arrSum(arr, i);
    }

    private static int maxValue(int[] arr, int i) {                 //the maximum value in the set array;
        int len = arr.length;
        if (len == 0) return i;
        int tmpMax = Math.max(arr[len - 1], i);
        return maxValue(Arrays.copyOfRange(arr, 0, len - 1), tmpMax);
    }

    private static int sumOfNumber(int number) {                    //the sum of the digits of a given number
        if (number == 0) return 0;
        return number % 10 + sumOfNumber(number / 10);
    }

    private static String flipTheNumber(String str) {               //number in reverse order
        return str.isEmpty() ? "" : flipTheNumber(str.substring(1)) + str.charAt(0);
    }


}
