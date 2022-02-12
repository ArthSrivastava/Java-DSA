package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int min_Idx = i;
            boolean hasMin = false;
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[min_Idx]) {
                    min_Idx = j;
                    hasMin = true;
                }
            }
            if(hasMin) {
                int tmp = arr[i];
                arr[i] = arr[min_Idx];
                arr[min_Idx] = tmp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
