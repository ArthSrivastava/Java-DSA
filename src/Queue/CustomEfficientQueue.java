package Queue;

public class CustomEfficientQueue<E>{
    protected Object[] queue;
    private static final int DEFAULT_SIZE = 10;
    int front = -1, rear = -1, capacity = 0;

    CustomEfficientQueue(){
        this(DEFAULT_SIZE);
    }

    CustomEfficientQueue(int c)
    {
        capacity = c;
        this.queue = new Object[capacity];
    }

    private boolean isFull(){
        return rear == (capacity-1);
    }

    private boolean isEmpty(){
        return front == -1;
    }

    public boolean enQueue(E item) throws Exception{
        if(isFull())
        {
            throw new Exception("Overflow");
        }
        else if(rear == -1)
            front++;
        rear++;
        queue[rear] = item;
        return true;
    }

    public Object deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        Object removed = queue[front];
        front++;
        return removed;
    }

    public Object peek() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return queue[front];
    }

    public void display(){
        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i] + " -> ");
        }
        System.out.println("END");
    }
}
