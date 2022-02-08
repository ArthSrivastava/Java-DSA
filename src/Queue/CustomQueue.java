package Queue;

public class CustomQueue<E> {
    protected Object[] queue;
    private static final int DEFAULT_SIZE = 10;
    int front = 0, rear = -1, size = 0, cap = 0;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int c)
    {
        cap = c;
        this.queue = new Object[cap];
    }

    private boolean isFull(){
        return size == cap;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public boolean enqueue(E item) throws Exception{
        if(isFull())
        {
            throw new Exception("Overflow");
        }
        queue[size++] = item;
        rear++;
        return true;
    }

    public Object dequeue() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Underflow");
        }
        Object removed = queue[0];
        for(int i = 0; i < size - 1; i++)
        {
            queue[i] = queue[i+1];
        }
        size--;
        return removed;
    }

    public Object peek() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return queue[0];
    }

    public void display(){
        for(int i = 0; i < size; i++)
        {
            System.out.print(queue[i] + " -> ");
        }
        System.out.println("END");
    }
}
