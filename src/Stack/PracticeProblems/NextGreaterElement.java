package Stack.PracticeProblems;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;
public class NextGreaterElement {
    private static void nextGreater(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n - 1]);
        ArrayList<Integer> nextGreater = new ArrayList<>();
        nextGreater.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            nextGreater.add(0, stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }
        System.out.println(nextGreater);
    }

    //method 2
    private static void nearestGreater(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(0, -1);
            } else if (!stack.isEmpty() && stack.peek() > arr[i]) {
                list.add(0, stack.peek());
            } else if (!stack.isEmpty() && stack.peek() <= arr[i]) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(0, -1);
                } else {
                    list.add(0, stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2};
        nextGreater(arr);
        nearestGreater(arr);
    }
}
