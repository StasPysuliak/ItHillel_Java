package home.work6;

class SimpleSearch {
    void show(int[] arr, int x) {
        long start;
        long end;
        start = System.currentTimeMillis();
        int result = search(arr, x);
        end = System.currentTimeMillis();

        if (result == -1) System.out.println("\nElement does not exist\n");
        else
            System.out.println("\nElement is present at index: " + result + "\nSimple Search found for: " + (end - start) + "ms\n");
    }

    private int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
