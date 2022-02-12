package Queue;

public class DeQueMain {
    public static void main(String[] args) throws Exception {
//        DeQueUsingLL<Integer> deQue = new DeQueUsingLL<>();
//        deQue.enQueueFront(87);
//        deQue.enQueueFront(23);
//        deQue.enQueueRear(79);
//        deQue.enQueueRear(101);
//        deQue.display();
//        System.out.println(deQue.getFront());
//        System.out.println(deQue.getRear());

//        System.out.println(deQue.deQueueFront());
//        deQue.display();
//        System.out.println(deQue.deQueueRear());
//        deQue.display();

//        DeQueUsingArray<Integer> dq= new DeQueUsingArray<>(5);
//
//        dq.enQueueFront(5);
//        dq.enQueueFront(6);
//        dq.enQueueRear(7);
//        dq.enQueueRear(8);
//        dq.enQueueRear(9);
//        System.out.println(dq.enQueueRear(10));
//        dq.display();
//
//        System.out.println(dq.deQueueRear());
//
//        dq.display();



//        dq.deQueueFront();
//        dq.deQueueFront();
//        dq.deQueueFront();

//        System.out.println(dq.getSize());
//        System.out.println(dq.getFront());

//        System.out.println(dq.deQueueRear());
//        System.out.println(dq.deQueueFront());
//        System.out.println(dq.enQueueFront(3));
//        System.out.println(dq.enQueueRear(2));
//        dq.display();

        DeQueUsingArrayEfficient<Integer> dq = new DeQueUsingArrayEfficient<>(5);
        dq.enQueueFront(5);
        dq.enQueueFront(6);
        dq.enQueueRear(7);
        dq.enQueueRear(8);
        dq.display();

        System.out.println(dq.deQueueFront());
        System.out.println(dq.deQueueRear());
        dq.display();

        System.out.println(dq.getSize());
    }
}
