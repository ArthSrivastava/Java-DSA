package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int l = arr.length;
        for(int i = 0; i < l - 1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
               else{
                   break;
                }
            }
        System.out.println(Arrays.toString(arr));
        }

    }
}
