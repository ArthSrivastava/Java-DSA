package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 3, 2, 0, 7};
        int n = arr.length;
//        int[] res = new int[n];
//        int k = 0;
//        for (int j : arr) {
//            if (j != 0) {
//                res[k] = j;
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(res));
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[count];
                arr[count] = tmp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
