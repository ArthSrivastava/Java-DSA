package Heap;

public class MinHeap {
    int[] arr;
    int size;
    int capacity;

    MinHeap(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public void insert(int x) {
        if (size == capacity) {
            return;
        }
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
            int tmp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = tmp;
            i = parent(i);
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }

    private void swap(int x, int y) {
    }

    private int parent(int i) {
        return (int)Math.floor((i - 1) / 2);
    }
}
