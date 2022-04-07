package Arrays.BinarySearch;

public class FirstAndLastOccurrence {

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
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 40};
        int x = 20;
        System.out.println(getFirstOccurrence(arr, x));
        System.out.println(getLastOccurrence(arr, x));

    }
}
