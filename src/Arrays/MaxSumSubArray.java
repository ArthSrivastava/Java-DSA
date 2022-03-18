package Arrays;

public class MaxSumSubArray {
    private static int maxSum(int[] arr) {
        int n = arr.length;
        int maxEnding = arr[0];
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 1, -2, 3, -1, 2, -2};
        System.out.println(maxSum(arr));
    }
}
