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

    //GFG submitted code
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        int c = 0;
        int[] span = new int[n];
        for(int i = 0; i < n; i++) {
            if(stack.isEmpty()) {
                span[c++] = 1;
            } else if(!stack.isEmpty() && price[stack.peek()] > price[i]) {
                span[c++] = i - stack.peek();
            } else {
                while(!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    span[c++] = i + 1;
                } else {
                    span[c++] = i - stack.peek();
                }
            }
            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] arr = {30, 20, 25, 28, 27, 29};
        stockSpanEfficient(arr);
    }
}
