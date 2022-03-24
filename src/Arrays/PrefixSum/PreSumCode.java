package Arrays.PrefixSum;

public class PreSumCode {
    public static int getSum(int[] arr, int l, int r) {
        int n = arr.length;
        int[] prefix_sum = new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        if (l != 0) {
            return prefix_sum[r] - prefix_sum[l - 1];
        } else {
            return prefix_sum[r];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        System.out.println(getSum(arr, 0, 2));
        System.out.println(getSum(arr, 1, 3));
        System.out.println(getSum(arr, 2, 6));

    }
}
