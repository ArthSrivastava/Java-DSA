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
//        System.out.println("Minimum element extracted:" + heap.extractMin());
//        heap.decreaseKey(3, 2);
//        System.out.println(heap.deleteKey(1));
        heap.buildHeap();
        heap.print();
    }
}
