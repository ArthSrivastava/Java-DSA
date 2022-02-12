package Queue;

import java.lang.reflect.Array;

public class DeQueUsingArray<T> {
    Object[] deQue;
    int front, size, capacity;
    DeQueUsingArray(int cap){
        capacity = cap;
        deQue = new Object[cap];
        front = 0;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public int getFront(){
        return front;
    }
    public boolean enQueueRear(T item){
        if(isFull()){
            return false;
        }
        deQue[size] = item;
        size++;
        return true;
    }

    public Object deQueueRear(){
        if(isEmpty()) {
            return -1;
        }
        Object removed = deQue[size-1];
        size--;
        return removed;
    }

    public boolean enQueueFront(T item){
        if(isFull()){
            return false;
        }
        else{
            for(int i = 1; i <= size; i++)
            {
                deQue[i] = deQue[i-1];
            }
        }
        deQue[front] = item;
        size++;
        return true;
    }

    public Object deQueueFront(){
        if(isEmpty()) {
            return -1;
        }
        Object removed = deQue[front];
        for(int i = 0; i < size-1; i++)
        {
            deQue[i] = deQue[i+1];
        }
        size--;
        return removed;
    }

    public void display(){
        for(int i = front; i < size; i++)
        {
            System.out.print(deQue[i] + " -> ");
        }
        System.out.println("End");
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
            return size == capacity;
    }
}
