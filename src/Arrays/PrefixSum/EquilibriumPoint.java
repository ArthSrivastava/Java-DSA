package Arrays.PrefixSum;
import java.util.Arrays;
import java.lang.reflect.Array;

public class EquilibriumPoint extends PreSumCode {
    private static int hasEquilibrium(int[] arr) {
        int n = arr.length;
        int l_sum = 0, r_sum = 0;
        if (getSum(arr, 1, n - 1) == 0) {
            return arr[0];
        } else if (getSum(arr, 0, n - 1) == 0) {
            return arr[n - 1];
        }
        for (int i = 1; i < n - 1; i++) {
            l_sum = getSum(arr, 0, i - 1);
            r_sum = getSum(arr, i + 1, n - 1);
            System.out.println("i: " + i + " L_Sum:" + l_sum);
            System.out.println("i: " + i + " R_Sum:" + r_sum);
            if (l_sum == r_sum) {
                return arr[i];
            }
        }
        return -1;
    }

    private static int checkEquiPoint(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (getSum(arr, 1, n - 1) == 0) {
            return arr[0];
        } else if (getSum(arr, 0, n - 1) == 0) {
            return arr[n - 1];
        }
        int[] front = new int[n];
        int[] back = new int[n];

    // Taking the prefixsum from front end array
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                front[i] = front[i - 1] + arr[i];
            } else {
                front[i] = arr[i];
            }
        }

    // Taking the prefixsum from back end of array
    for(int i = n - 1; i > 0; i--)
    {
        if (i <= n - 2) {
            back[i] = back[i + 1] + arr[i];
        } else {
            back[i] = arr[i];
        }
    }
//        System.out.println(Arrays.toString(front));
//        System.out.println(Arrays.toString(back));
    // Checking for equilibrium index by
    //comparing front and back sums
    for(int i = 0; i < n; i++)
    {
        if (front[i] == back[i]) {
            return arr[i];
        }
    }
    // If no equilibrium index found,then return -1
        return -1;
}

    private static int hasEqui(int[] arr) {
        int n = arr.length;
        int l_sum = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (l_sum == sum - arr[i]) {
                return arr[i];
            }
            l_sum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, 2};
        System.out.println(hasEqui(arr));
        System.out.println(hasEquilibrium(arr));
        System.out.println(checkEquiPoint(arr));
    }
}
