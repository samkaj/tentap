import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        
        int mid = arr.length / 2;
        
        // Recursively merge sort the arrays
        int[] arr1 = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(arr1, arr2);
    }


    public static int[] merge(int[] a, int[] b) {
        // Merges two sorted arrays
        int[] merged = new int[a.length + b.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < a.length && r < b.length) {
            if (a[l] < b[r])
                merged[i++] = a[l++];
            else
                merged[i++] = b[r++];
        }
        if (l < a.length) {
            for (int j = l; j < a.length; j++)
                merged[i++] = a[j];
        }
        else if (r < b.length) {
            for (int j = r; j < b.length; j++)
                merged[i++] = b[j];
        }
        return merged;
    }
}