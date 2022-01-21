package home.work6;

class SelectionSort {
    void show(int[] arr) {
        long start;
        long end;
        int n = arr.length;
        start = System.currentTimeMillis();
        sort(arr,n);
        end = System.currentTimeMillis();

        System.out.println("Selection Sort: " + n + "random items");
        printArray(arr);
        System.out.println("Selection Sort sorted array by: " + (end - start) + "ms\n");
    }

    private void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
