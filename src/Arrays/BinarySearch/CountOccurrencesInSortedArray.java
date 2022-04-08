package Arrays.BinarySearch;

public class CountOccurrencesInSortedArray {
    private static int getFirstOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                res = mid;
                e = mid - 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }

    private static int getLastOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                res = mid;
                s = mid + 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return res;
    }

    private static int countOccurrences(int[] arr, int x) {
        int firstOccurrence = getFirstOccurrence(arr, x);
        int lastOccurrence = getLastOccurrence(arr, x);
        if(firstOccurrence != -1)
            return lastOccurrence - firstOccurrence + 1;
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10};
        int x = 7;
        System.out.println(countOccurrences(arr, x));
    }
}
