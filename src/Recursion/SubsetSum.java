package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    private static int subset(int[] arr, int n, int sum)
    {
        if(n == 0)
        {
            return sum == 0 ? 1 : 0;
        }
        return subset(arr, n - 1, sum) + subset(arr, n - 1, sum - arr[n-1]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15};
        System.out.println(subset(arr, arr.length, 25));
    }
}
