package Stack.PracticeProblems;

public class CustomStackWithGetMin {
    public int[] data;
    public int[] min;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;
    int top2 = -1;
    CustomStackWithGetMin(){
        this(DEFAULT_SIZE);
    }

    CustomStackWithGetMin(int size)
    {
        this.data = new int[size];
        this.min = new int[size];
    }

    public boolean push(int element) throws Exception {
        if(isFull())
        {
            throw new Exception("Overflow");
        }
        if (isEmpty()) {
            top++;
            top2++;
            data[top] = element;
            min[top2] = element;
            return true;
        }
        top++;
        data[top] = element;
        if (data[top] <= min[top2]) {
            top2++;
            min[top] = data[top];
        }
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
        if (data[top] == min[top2]) {
            top2--;
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

    public int getMin() {
        return min[top2];
    }
    public static void main(String[] args) throws Exception {
        CustomStackWithGetMin stack = new CustomStackWithGetMin(10);
        stack.push(20);
        stack.push(10);
        System.out.println(stack.getMin());
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}
