package Queue;

public class DeQueUsingArrayEfficient<T> {
    Object[] deQue;
    int front, size, capacity;
    DeQueUsingArrayEfficient(int cap){
        capacity = cap;
        deQue = new Object[cap];
        front = 0;
        size = 0;
    }


    public boolean enQueueRear(T item){
        if(isFull()){
            return false;
        }
        int rear = getRear();
        rear = (rear + 1) % capacity;
        deQue[rear] = item;
        size++;
        return true;
    }

    public Object deQueueRear(){
        if(isEmpty()) {
            return -1;
        }
        int rear = getRear();
        Object removed = deQue[rear];
        size--;
        return removed;
    }

    public boolean enQueueFront(T item){
        if(isFull()){
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deQue[front] = item;
        size++;
        return true;
    }

    public Object deQueueFront(){
        if(isEmpty()) {
            return -1;
        }
        Object removed = deQue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public void display(){
        int i = front;
        int rear = getRear();
        do{
            System.out.print("i:" + i + " - " + deQue[i] + " -> ");
            i = (i + 1) % capacity;
        } while(!(i > rear));
        System.out.println("End");
    }

    private int getRear() {
        return (front + size - 1) % capacity;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
            return size == capacity;
    }

    public int getSize(){
        return size;
    }

    public int getFront(){
        return front;
    }
}
