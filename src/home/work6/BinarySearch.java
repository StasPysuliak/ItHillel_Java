package home.work6;

class BinarySearch {
    void show (int[] arr,  int x) {
        long start;
        long end;
        int n = arr.length;
        start = System.currentTimeMillis();
        int result2 = binarySearch(arr, 0, n - 1, x);
        end = System.currentTimeMillis();

        if (result2 == -1) System.out.println("Element does not exist\n");
        else System.out.println("Element found at index: " + result2 + "\nBinary Search found for: " + (end - start) + "ms\n");

    }

    private int binarySearch(int[] arr, int l, int r, int x) {
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
