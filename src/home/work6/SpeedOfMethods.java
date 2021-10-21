package home.work6;

import java.util.Scanner;

class SpeedOfMethods {
    void show(int size, int x) {
        SimpleSearch simpleSearch = new SimpleSearch();
        BinarySearch binarySearch = new BinarySearch();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();

        int tmp;

        int[] arr = new int[size];
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < size; i++) {
            tmp = (int) (Math.random() * 100);
            arr1[i] = tmp;
            arr2[i] = tmp;
        }
        simpleSearch.show(arr, x);
        binarySearch.show(arr, x);
        quickSort.show(arr1);
        selectionSort.show(arr2);
    }

    int correctNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) number = scanner.nextInt();
        else {
            System.out.println("Wrong argument. Please enter a number");
            System.exit(0);
        }
        return number;
    }
}
