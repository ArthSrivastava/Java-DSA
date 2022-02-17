package Sorting;

import java.util.Arrays;

public class MergeSort {
    private static int[] mergeSort(int[] arr)
    {
        if(arr.length <= 1)
            return arr;
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
            int[] res = new int[left.length + right.length];
            int i = 0, j = 0, k = 0;

            while(i < left.length && j < right.length)
            {
                if(left[i] <= right[j])
                {
                    res[k] = left[i];
                    i++;
                }
                else{
                    res[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length){
                res[k] = left[i];
                k++;
                i++;
            }
            while(j < right.length){
                res[k] = right[j];
                k++;
                j++;
            }
            return res;
    }


    private static void mergeSortInPlace(int[] arr, int s, int e)
    {
        if((e - s) <= 1)
            return;
        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] res = new int[e - s];
        int i = s, j = m, k = 0;

        while(i < m && j < e)
        {
            if(arr[i] <= arr[j])
            {
                res[k] = arr[i];
                i++;
            }
            else{
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            res[k] = arr[i];
            k++;
            i++;
        }
        while(j < e){
            res[k] = arr[j];
            k++;
            j++;
        }
        for(int l = 0; l < res.length; l++)
        {
            arr[s + l] = res[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 3, 2, 0};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
