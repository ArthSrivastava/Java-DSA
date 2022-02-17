package Sorting;

import java.util.Arrays;

public class RecursiveSorting {
    private static void bubble(int[] arr, int r, int c)
    {
        if(r < 1)
        {
            return;
        }
        if(c < r)
        {
            if(arr[c] > arr[c+1])
            {
                int tmp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = tmp;
            }
            bubble(arr, r, c + 1);
        }
        else{
            bubble(arr, r - 1, 0);
        }
    }


    private static void selection(int[] arr, int r, int c, int max)
    {
        if(r < 1)
        {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[max])
            {
                selection(arr, r, c + 1, c);
            }
            else{
                selection(arr, r, c + 1, max);
            }
        }
        else{
            int tmp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = tmp;
            selection(arr, r - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
