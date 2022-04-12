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
//        for (int i = size - 1; i != 0 && arr[getParent(i)] > arr[i];) {
//            int tmp = arr[i];
//            arr[i] = arr[getParent(i)];
//            arr[getParent(i)] = tmp;
//            i = getParent(i);
//        }
    }

    public void minHeapifyRec(int i) {
        int lt = getLeftChild(i), rt = getRightChild(i);
        int smallest = i;
        if (lt < size && arr[lt] < arr[smallest]) {
            smallest = lt;
        }
        if (rt < size && arr[rt] < arr[smallest]) {
            smallest = rt;
        }
        if (i != smallest) {
            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
            minHeapifyRec(smallest);
        }
    }

    public void minHeapifyIterative(int i) {
        while (i < size) {
            int lt = getLeftChild(i), rt = getRightChild(i);
            int smallest = i;
            if (lt < size && arr[lt] < arr[smallest]) {
                smallest = lt;
            }
            if (rt < size && arr[rt] < arr[smallest]) {
                smallest = rt;
            }
            if (i != smallest) {
                int tmp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = tmp;
            } else {
                break;
            }
            i = smallest;
        }
    }

    public int extractMin() {
        if (size != 0) {
            if (size == 1) {
                size--;
                return arr[0];
            }
            int tmp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = tmp;
            size--;
            minHeapifyRec(0);
            return tmp;
        }
        return -1;
    }

    public void decreaseKey(int i, int x) {
        if (i < size) {
            arr[i] = x;
            for (int j = i; j != 0 && arr[getParent(j)] > arr[j]; ) {
                int tmp = arr[j];
                arr[j] = arr[getParent(j)];
                arr[getParent(j)] = tmp;
                j = getParent(j);
            }
        }
    }

    public int deleteKey(int i) {
        if (i < size) {
            //My method ->
//            int tmp = arr[i];
//            arr[i] = arr[size - 1];
//            arr[size - 1] = tmp;
//            size--;
//            minHeapifyRec(i);
            int removed = arr[i];
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
            return removed;
        }
        return -1;
    }

    public void buildHeap() {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            minHeapifyRec(i);
        }
    }
    private int getLeftChild(int root) {
        return 2 * root + 1;
    }

    private int getRightChild(int root) {
        return 2 * root + 2;
    }

    private int getParent(int i) {
        return (int)Math.floor((i - 1) / 2);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }

}
