package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {98, 78, 68, 48, 28, 18};
        int n = arr.length;
        int temp = -1;
        for(int i = 0; i < n; i++)
        {
            boolean isSwapped = false;
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isSwapped = true;
                }
                temp = j;
            }
            if(!isSwapped)
                break;
        System.out.println("j:" + temp + "->" + Arrays.toString(arr));
        }
    }
}
