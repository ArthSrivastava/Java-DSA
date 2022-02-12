package Queue;

public class DeQueUsingLL <T>{
    private Node<T> front;
    private Node<T> rear;

    DeQueUsingLL(){
        this.front = null;
        this.rear = null;
    }

    public Object getRear(){
        return rear.val;
    }
    public Object getFront(){
        return front.val;
    }
    public boolean enQueueFront(T item){
        Node<T> node = new Node<>(item);
        if(front == null){
            rear = node;
        }
        else{
            node.next = front;
            front.prev = node;
        }
            front = node;
            return true;
    }

    public boolean enQueueRear(T item){
        Node<T> node = new Node<>(item);
        if(front == null){
            front = node;
        }
        else{
            rear.next = node;
            node.prev = rear;
        }
            rear = node;
            return true;
    }

    public Object deQueueFront() throws Exception
    {
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        Object removed = front.val;
        front = front.next;
        front.prev = null;
        return removed;
    }

    public Object deQueueRear() throws Exception
    {
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        Object removed = rear.val;
        rear = rear.prev;
        rear.next = null;
        return removed;
    }

    private boolean isEmpty() {
        return front == null;
    }

    public void display(){
        Node<T> temp = front;
        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private static class Node<T>{
        T val;
        Node<T> next;
        Node<T> prev;

        Node(T val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
