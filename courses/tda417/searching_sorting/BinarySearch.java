public class BinarySearch {
    public static int search(int[] a, int goal) {
        int lo = 0;
        int hi = a.length;
        int mid = (lo + hi) / 2;

        while (lo <= hi) {
            if (a[mid] < goal)
                lo = mid + 1;
            else if (a[mid] > goal)
                hi = mid - 1;
            else 
                return mid;
        }

        return -1;
    }
}