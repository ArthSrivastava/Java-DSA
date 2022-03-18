package Arrays;

public class LongestEvenOddSubArray {

    //Naive approach: O(n^2)
    private static int longestSubArray(int[] arr) {
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    count++;
                } else {
                    break;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }

    //Efficient Approach
    private static int efficient(int[] arr) {
        int n = arr.length;
        int res = 1, count = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 6, 3, 8};
        System.out.println(longestSubArray(arr));
        System.out.println(efficient(arr));
    }
}
