package Arrays;

public class MaxConsecutiveOnes {
    private static int maxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}
