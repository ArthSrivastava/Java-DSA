package Heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(10);
        heap.insertInMinHeap(10);
        heap.insertInMinHeap(20);
        heap.insertInMinHeap(30);
        heap.insertInMinHeap(5);
        heap.insertInMinHeap(200);
        heap.print();
//        System.out.println("Minimum element extracted:" + heap.extractMin());
//        heap.decreaseKey(3, 2);
//        System.out.println(heap.deleteKey(1));
//        heap.buildMinHeap();

        heap.heapSort();
        heap.print();

    }
}
