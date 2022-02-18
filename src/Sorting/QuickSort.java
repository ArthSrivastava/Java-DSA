package Sorting;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high){
        if(low >= high)
            return;

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while(s <= e)
        {
            while(arr[s] < pivot)
                s++;
            while(arr[e] > pivot)
                e--;
            if(s <= e){
                int tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

    public static void main(String[] args) {
        int[] arr = {4, 26, 7, 8, 1, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
