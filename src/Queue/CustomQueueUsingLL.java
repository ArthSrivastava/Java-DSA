package Queue;

import Stack.CustomStackUsingLL;

public class CustomQueueUsingLL <T>{

    private Node<T> front;
    private Node<T> rear;
    int size;
    CustomQueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public Object getRear()
    {
        return rear.data;
    }

    public Object getFront()
    {
        return front.data;
    }

    public boolean enQueue(T item){
        Node<T> node = new Node<>(item);
        if(isEmpty())
        {
            front = node;
        }
        else{
        rear.next = node;
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
        front = front.next;
        if(front == null) rear = null;
        size--;
        return removed;
    }


    public Object peek() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Underflow");
        }
        return front.data;
    }

    public void display(){
        Node<T> temp = front;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
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
