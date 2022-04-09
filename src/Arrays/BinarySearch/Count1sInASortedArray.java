package Arrays.BinarySearch;

public class Count1sInASortedArray {
    private static int getCount(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int tmp = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                tmp = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (tmp != -1) {
            return n - tmp;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        System.out.println(getCount(arr));
    }
}
