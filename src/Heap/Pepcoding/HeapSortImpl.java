package Heap.Pepcoding;

import java.util.Arrays;
public class HeapSortImpl {

    //Min heap sorts in descending order as minimum element is swapped with the last element
    //Max heap sorts in ascending order as max element is swapped with the last element

    public static void main(String[] args) {
        int[] arr = {3, 30, 23, 47, 40, 600, 60};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Initially creating a min heap
    private static void heapify(int[] arr) {
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--) {
            downHeapify(arr, n, i);
        }
    }

    public static void heapSort(int[] arr) {
        heapify(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            //Swapping the first and last element
            swap(arr, 0, i);

            //calling down heapify on root or 0th index
            downHeapify(arr, i, 0);
            System.out.println("Present Heap:" + Arrays.toString(arr));
        }
    }
    private static void downHeapify(int[] arr, int n, int pi) {
        int li = 2 * pi + 1;
        int ri = 2 * pi + 2;
        int min = pi;
        if(li < n && arr[li] < arr[min]) {
            min = li;
        }
        if(ri < n && arr[ri] < arr[min]) {
            min = ri;
        }

        if(min != pi) {
            swap(arr, min, pi);
            downHeapify(arr, n, min);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
