package home.work6;

public class AlgorithmicEfficiency {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int[] arr1 = {10, 7, 8, 9, 1, 5};
        int[] arr2 = {64, 25, 12, 22, 11};
        int x = 10;
        int n = arr.length;
        int n1 = arr.length;
        int result = search(arr, x);
        if (result == -1) System.out.println("Element is not present in array");
        else System.out.println("Element is present at index " + result);


        int result2 = binarySearch(arr, 0, n - 1, x);
        if (result2 == -1) System.out.println("Element not present");
        else System.out.println("Element found at index " + result2);


        QuickSort quickSort = new QuickSort();
        quickSort.show(arr1, n1);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.show(arr2);
    }

    private static int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

}
