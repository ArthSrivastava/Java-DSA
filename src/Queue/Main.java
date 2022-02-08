package Queue;

import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue<Integer> queue = new CustomQueue<>(5);
//        queue.enqueue(78);
//        queue.enqueue(89);
//        queue.enqueue(83);
//        queue.enqueue(46);
//        queue.enqueue(35);
//        queue.enqueue(5);

//        queue.display();

//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.display();

//        System.out.println(queue.peek());

          CustomEfficientQueue<Integer> queue2 = new CustomEfficientQueue<Integer>(5);
          queue2.enqueue(5);
          queue2.enqueue(6);
          queue2.enqueue(7);
          queue2.enqueue(8);
          queue2.enqueue(9);
          queue2.display();

        System.out.println(queue2.dequeue());

        queue2.display();
    }
}

