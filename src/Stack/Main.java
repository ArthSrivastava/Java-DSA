package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(6);
//        Deque<Integer> deque = new LinkedList<>();

//        DynamicStack<String> stack = new DynamicStack<>(5);
        CustomStack<String> stack = new CustomStack<>(5);
        stack.push("Arth");
        stack.push("Mihir");
        stack.push("Varun");
        stack.push("Swapnil");
        stack.push("Mridul");
        stack.push("Akshay");
//        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
