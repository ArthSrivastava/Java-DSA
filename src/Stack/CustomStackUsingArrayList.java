package Stack;

import java.util.ArrayList;

public class CustomStackUsingArrayList<E> {
    private final ArrayList<E> stack;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    CustomStackUsingArrayList(){
        this(DEFAULT_SIZE);
    }

    CustomStackUsingArrayList(int size)
    {
        this.stack = new ArrayList<>(size);
    }

    public boolean push(E element){
        top++;
        stack.add(top, element);
        return true;
    }


    public Object pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Underflow");
        }
        Object removed = stack.get(top);
        stack.remove(top);
        top--;
        return removed;
    }

    protected boolean isEmpty()
    {
        return top == -1;
    }

    public Object peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stack.get(top);
    }

    public void display(){
        System.out.print(stack + " -> ");
        System.out.println("Top at:" + top + " index" );
    }
}
