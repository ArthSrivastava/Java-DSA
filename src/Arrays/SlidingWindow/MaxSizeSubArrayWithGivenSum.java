package Arrays.SlidingWindow;

public class MaxSizeSubArrayWithGivenSum {

    //Sliding Window approach: Works only for positive numbers in the array
    private static int getMaxSubArray(int[] arr, int k) {
        int i = 0, j = 0, n = arr.length;
        int maxSize = Integer.MIN_VALUE;
        int sum = 0;
        while(j < n) {
            sum += arr[j];
            if (sum < k) {
                j++;
            } else if (sum == k) {
                maxSize = Math.max(maxSize, j - i + 1);
                j++;
            } else {
                while (i < n && sum > k) {
                    sum -= arr[i];
                    i++;
                }
                if (sum == k) {
                    maxSize = Math.max(maxSize, j - i + 1);
                }
                j++;
            }
//            System.out.println(sum);
        }
        return maxSize;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,4};
        int k = 6;
        System.out.println(getMaxSubArray(arr, k));
    }
}
