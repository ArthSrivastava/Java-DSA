package Stack;

public class CustomStack<E> {
    public Object[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size)
    {
        this.data = new Object[size];
    }

    public boolean push(E element) throws Exception {
        if(isFull())
        {
            throw new Exception("Overflow");
        }
        top++;
        data[top] = element;
        return true;
    }

    protected boolean isFull()
    {
        return top == data.length - 1;
    }

    public Object pop() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Underflow");
        }
        return data[top--];
    }

    protected boolean isEmpty()
    {
        return top == -1;
    }

    public Object peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[top];
    }
}
