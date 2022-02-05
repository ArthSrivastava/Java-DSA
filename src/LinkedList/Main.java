package LinkedList;

public class Main {
    public static void main(String[] args) {
        //Singly linked list
        Linkedlist list = new Linkedlist();
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(103);
        list.insertAtIndex(40, 3);
//        System.out.println(list.getSize());
//        list.display();
//        System.out.println(list.deleteFirst());
////        System.out.println(list.getSize());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
        list.display();


//        list.insertRec(7,3);
//        list.display();
//        list.reverseRec(list.head);
//        list.display();


 /* DLL
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(4);
        System.out.println(list.getSize());
        list.display();
        list.insertLast(99);
        list.insert(6, 76);
        list.display();
        list.display();
        System.out.println(list.getSize());
        System.out.println(list.deleteBeg());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
  */

 //CLL

//        CLL list = new CLL();
//        list.insert(6);
//        list.insert(5);
//        list.insert(3);
//        list.insert(99);
//        list.display();
//        list.insertAfter(99,76);
//        list.display();
//        list.delete(76);
//        list.display();
    }
}
