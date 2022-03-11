package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 13, 20, 20};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
            if (i == (n - 2)) {
                System.out.print(arr[i + 1]);
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
