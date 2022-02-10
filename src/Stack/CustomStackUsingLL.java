package Stack;

public class CustomStackUsingLL<T> {
    private Node<T> top = null;
    private int size = 0;
    private boolean isEmpty()
    {
        return top == null;
    }

    public int getSize(){
        return size;
    }

    public boolean push(T item){
        Node<T> node = new Node<>(item);
        node.next = top;
        top = node;
        size++;
        return true;
    }

    public Object pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty:Underflow");
        }
        Object removed = top.data;
        top = top.next;
        size--;
        return removed;
    }

     public Object peek() throws Exception{
         if(isEmpty())
         {
             throw new Exception("Stack is empty:Underflow");
         }
         return top.data;
     }

     public void display(){
        Node<T> temp = top;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
         System.out.println("Null");
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
