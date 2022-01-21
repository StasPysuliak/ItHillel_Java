package home.work6;

class QuickSort {
    void show(int[] arr) {
        long start;
        long end;
        int n = arr.length;
        start = System.currentTimeMillis();
        quickSort(arr, 0, n - 1);
        end = System.currentTimeMillis();

        System.out.println("Quick Sort: " + n + "random items");
        printArray(arr, n);
        System.out.println("Quick Sort sorted array by: " + (end - start) + "ms\n");
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
