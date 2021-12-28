public class BinarySearch {
    public static int search(int[] a, int goal) {
        int lo = 0;
        int hi = a.length-1;
        int mid;
        int index = -1;

        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (a[mid] < goal)
                lo = mid + 1;
            else if (a[mid] > goal)
                hi = mid - 1;
            else {
                index = mid;
                hi = mid - 1; // we want to find the first occurrence :^)
            }
        }

        return index;
    }
}