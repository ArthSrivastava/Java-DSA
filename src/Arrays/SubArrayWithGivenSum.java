package Arrays;

public class SubArrayWithGivenSum {
    private static boolean hasSubArray(int[] arr, int sum) {
        int n = arr.length;
        int curr_sum = arr[0], s = 0;
        for (int e = 1; e < n; e++) {
            while (curr_sum > sum && s < (e - 1)) {
                curr_sum -= arr[s];
                s++;
            }
            if (curr_sum == sum) {
                return true;
            } else {
                curr_sum += arr[e];
            }
        }
        return (curr_sum == sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        System.out.println(hasSubArray(arr, 33));
    }
}
