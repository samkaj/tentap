public class InsertionSort {
    public static void sort(int[] a) {
        // Sorts an array using insertion sort
        // Time complexity O(N^2)
        int lo = 0;
        int hi = a.length - 1;
        for (int i = lo; i <= hi; i++) {
            int value = a[i];
            int j = i;
            while (j > lo && a[j-1] > value) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = value;
        }

        System.out.println();
    }

}