package Stack.PracticeProblems;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;
public class PreviousGreaterElement {
    private static void getPrevGreaterEle(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int[] prevGreater = new int[n];
        prevGreater[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            prevGreater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(prevGreater));
    }

    private static void nearestGreaterToLeft(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (!stack.isEmpty() && stack.peek() > arr[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && stack.peek() <= arr[i]) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {40, 30, 20, 10};
        getPrevGreaterEle(arr);
        nearestGreaterToLeft(arr);
    }
}
