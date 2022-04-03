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
        int[] arr = {15, 22, 30, 10, 15, 64, 1, 3, 9, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
