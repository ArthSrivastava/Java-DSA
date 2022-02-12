package Queue;

public class CircularQueueUsingLL<T> {
    Node<T> front, rear;
    int size;

    CircularQueueUsingLL(){
        this.front = null;
        this.rear = null;
        size = 0;
    }

    public boolean enQueue(T item){
        Node<T> node = new Node<>(item);
        if(isEmpty())
        {
            front = node;
        }
        else {
            rear.next = node;
            node.next = front;
        }
        rear = node;
        size++;
        return true;
    }

    public Object deQueue() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Underflow");
        }
        Object removed = front.data;
        if(front == rear) {
            rear = null;
            front = null;
        }
        else {
            front = front.next;
            rear.next = front;
        }
        size--;
        return removed;
    }

    public void display(){
        Node<T> temp = front;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while(temp != front);
        System.out.println("End");
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public Object getFront() {
        return front.data;
    }

    public Object getRear() {
        return rear.data;
    }

    public int getSize() {
        return size;
    }

    private static class Node <T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
}
