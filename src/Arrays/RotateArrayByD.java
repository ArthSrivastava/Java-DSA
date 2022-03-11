package Arrays;

import java.util.Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int[] temp = new int[d];
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int k = n - d;
        for (int i = 0; i < d; i++) {
            arr[k] = temp[i];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
