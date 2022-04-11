package Heap;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(5);
        heap.insert(200);
        heap.print();
    }
}
