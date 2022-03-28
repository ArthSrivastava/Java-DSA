package LinkedList;

public class DLL {
    private Node head;
    private int size;

    public int getSize(){
        return size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node temp = get(size-1);
        if(head == null)
        {
            insertFirst(val);
            return;
        }
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void insert(int after, int val) {
        Node node = new Node(val);
        Node temp = head;
        if (head == null) {
            System.out.println("Element does not exist");
            return;
        }
        while (temp != null) {
            if (temp.val == after) {
                break;
            }
            temp = temp.next;
        }
        if (temp != null) {
            node.next = temp.next;
            if (node.next != null) {
                node.next.prev = node;
            }
            temp.next = node;
            node.prev = temp;
            size++;
        }
        else{
            System.out.println("Element does not exist");
        }
    }

    public int deleteBeg()
    {
        int val;
        if(head == null)
        {
            return -1;
        }
        else{
            val = head.val;
            head = head.next;
            if(head != null)
                head.prev = null;
            size--;
        }
        return val;
    }

    public int deleteLast(){
        Node temp = get(size - 2);
        int val = -1;
        if(temp.next != null) {
            val = temp.next.val;
        }
        temp.next = null;
        size--;
        return val;
    }

    public int delete(int val)
    {
        Node temp = find(val);
        int value = -1;
        if(size <= 1)
        {
            return deleteBeg();
        }
        if(temp != null) {
            value = temp.val;
            if(temp.prev != null)
                temp.prev.next = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
            size--;
        }
        return value;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null)
        {
            if(temp.val == val)
                break;
            temp = temp.next;
        }
        return temp;
    }

    public Node get(int pos){
        Node temp = head;
        for(int i=0; i<pos; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        Node temp = head;
        Node last = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

//        System.out.println("Printing in reverse");
//        while(last != null){
//            System.out.print(last.val + " -> ");
//            last = last.prev;
//        }
//        System.out.println("Start");
//        System.out.println();
    }



     class Node{
         int val;
         Node next;
         Node prev;
         public Node(int val){
             this.val = val;
         }
    }
}
