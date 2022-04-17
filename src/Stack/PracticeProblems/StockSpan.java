package Stack.PracticeProblems;

import java.util.Stack;

//Span: Consecutive elements less than or equal to current element including itself
public class StockSpan {
    //Naive approach
    public static void span(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] <= arr[i]) {
                    span++;
                } else {
                    break;
                }
            }
            System.out.print(span + " ");
        }
    }

    public static void stockSpanEfficient(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print(1 + " ");
        int n = arr.length;
        int span = 1;
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            span = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            System.out.print(span + " ");
            stack.push(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {30, 20, 25, 28, 27, 29};
        stockSpanEfficient(arr);
    }
}
