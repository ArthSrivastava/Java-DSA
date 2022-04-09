package Arrays.PrefixSum;

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInASortedArray {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int sum = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        arr[0] = prefix[n - 1] - (n * nums[0]);
        for(int i = 1; i < n; i++) {
            int nextSum = ((prefix[n - 1] - prefix[i]) - (n - i - 1) * nums[i]);
            int prevSum = ((nums[i] * i) - prefix[i - 1]);
            arr[i] = prevSum + nextSum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(arr)));
    }
}
