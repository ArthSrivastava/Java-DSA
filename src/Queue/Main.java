package Queue;

import Stack.CustomStackUsingLL;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue<Integer> queue = new CustomQueue<>(5);
//        queue.enQueue(78);
//        queue.enQueue(89);
//        queue.enQueue(83);
//        queue.enQueue(46);
//        queue.enQueue(35);
//        queue.enQueue(5);

//        queue.display();

//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        System.out.println(queue.deQueue());
//        queue.display();

//        System.out.println(queue.peek());

//          CustomEfficientQueue<Integer> queue2 = new CustomEfficientQueue<Integer>(5);
//          queue2.enQueue(5);
//          queue2.enQueue(6);
//          queue2.enQueue(7);
//          queue2.enQueue(8);
//          queue2.enQueue(9);
//          queue2.display();
//
//        System.out.println(queue2.deQueue());
//
//        queue2.display();

//        CircularQueue<Integer> cirQueue = new CircularQueue<Integer>(5);
//        cirQueue.enQueue(5);
//        cirQueue.enQueue(7);
//        cirQueue.enQueue(8);
//        cirQueue.enQueue(6);
//        cirQueue.enQueue(3);
//        cirQueue.display();
//
//        System.out.println(cirQueue.deQueue());
//        System.out.println(cirQueue.deQueue());

//        cirQueue.enQueue(23);
//        cirQueue.enQueue(45);
//        cirQueue.display();

        CustomQueueUsingLL<Integer> queueLL = new CustomQueueUsingLL<>();

        queueLL.enQueue(5);
        queueLL.enQueue(8);
        queueLL.enQueue(3);
        queueLL.enQueue(7);
        queueLL.enQueue(9);

        queueLL.display();

        System.out.println(queueLL.deQueue());
        System.out.println(queueLL.deQueue());

        queueLL.display();

        System.out.println("Peek:" + queueLL.peek());

        System.out.println("Front:" + queueLL.getFront());
        System.out.println("Rear:" + queueLL.getRear());
    }
}

