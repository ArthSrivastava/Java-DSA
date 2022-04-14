package Arrays.BinarySearch;
//https://practice.geeksforgeeks.org/problems/peak-element/1/#
public class PeakElement {
    private static int getPeakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 15, 7};
        System.out.println(getPeakElement(arr));
    }
}
