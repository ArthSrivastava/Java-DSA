package Queue;

public class CircularQueue<T> {
    protected Object[] queue;
    private static final int DEFAULT_SIZE = 10;
    int front = 0, rear = -1, capacity = 0, size = 0;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }

    CircularQueue(int c)
    {
        capacity = c;
        this.queue = new Object[capacity];
    }

    private boolean isFull(){
        return size == capacity;
    }

    private boolean isEmpty(){
        return size == 0;
    }
    public int getRear(){
        if(isEmpty())
            return -1;
        return (front + size - 1) % capacity;
    }
    public int getFront(){
        if(isEmpty())
            return -1;
        return front;
    }
    public boolean enQueue(T item) throws Exception
    {
        if(isFull()){
            throw new Exception("Overflow");
        }
            rear = getRear();
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
            return true;
    }

    public Object deQueue() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Underflow");
        }
        Object removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public void display(){
        int i = front;
        do{
            System.out.print(queue[i] + " -> ");
            i = (i + 1) % capacity;
        } while(i != rear);
        System.out.print(queue[rear] + " -> ");
        System.out.println("End");
    }
}
