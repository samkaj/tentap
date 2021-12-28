public class SelectionSort {
    public static void sort(int[] a) {
        // Sorts an array using selection sort
        // Time complexity O(N^2)
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            swap(a, i, min);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}