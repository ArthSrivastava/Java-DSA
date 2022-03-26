package Arrays.SlidingWindow;

import java.util.Arrays;

public class NBonacciNumber {
    //O(N^2) solution
    private static void printNBonacci(int n, int m) {
        int[] arr = new int[m];
        arr[n - 1] = 1;
        for (int i = n; i < m; i++) {
            for (int j = i - n; j < i; j++) {
                arr[i] += arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Using sliding window
    private static void nBonacci(int n, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        arr[n - 1] = 1;
        arr[n] = 1;
        for (int i = n + 1; i < m; i++) {
            arr[i] = 2 * arr[i - 1] - arr[i - n - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int n = 4, m = 8;
        nBonacci(4, 8);
    }
}
