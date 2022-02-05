package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if (head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertAfter(int after, int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            System.out.println("Value does not exist");
            return;
        }
        else if(after == tail.val){
            insert(val);
            return;
        }
        do{
            if(temp.val == after)
            {
                break;
            }
            temp = temp.next;
        } while(temp != head);
        node.next = temp.next;
        temp.next = node;
    }

    public void delete(int val){
        Node temp = head;
            if(head == null)
                return;
            else if (temp.val == val) {
            head = head.next;
            tail.next = head;
            return;
         }
        Node tmp = head;
            do{
                if (temp.val == val) {
                    break;
                }
                tmp = temp;
                temp = temp.next;
            } while(temp != head);
            tmp.next = temp.next;
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("End");
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
