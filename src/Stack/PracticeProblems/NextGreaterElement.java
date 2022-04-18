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

    public static void main(String[] args) {
        int[] arr = {25, 20, 15, 10};
        nextGreater(arr);
    }
}
