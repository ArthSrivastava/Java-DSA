package Stack.PracticeProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestAreaInAHistogram {
    //Naive Method
    private static int getLargestArea(int[] arr) {
        int l = arr.length;
        int res = 0;
        for (int i = 0; i < l; i++) {
            int area = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    area += arr[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < l; j++) {
                if (arr[j] >= arr[i]) {
                    area += arr[i];
                } else {
                    break;
                }
            }
            res = Math.max(res, area);
        }
        return res;
    }

    //Efficient Method
    private static int largestArea(int[] arr) {
        int l = arr.length;
        int res = 0;
        ArrayList<Integer> ps = getPrevSmaller(arr);
        ArrayList<Integer> ns = nextSmaller(arr);
        System.out.println(ps);
        System.out.println(ns);
        for (int i = 0; i < l; i++) {
            int area = arr[i];
            area += (i - ps.get(i) - 1) * arr[i];
            area += (ns.get(i) - i - 1) * arr[i];
            res = Math.max(res, area);
        }
        return res;
    }
    private static ArrayList<Integer> nextSmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nextSmaller = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller.add(0, stack.isEmpty() ? n : stack.peek());
            stack.push(i);
        }
        return nextSmaller;
    }

    private static ArrayList<Integer> getPrevSmaller(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> prevSmaller = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            prevSmaller.add(stack.isEmpty() ? -1 : stack.peek());
            stack.push(i);
        }
        return prevSmaller;
    }

    //Best method
    private static int area(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int tp = stack.pop();
                int curr = arr[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                res = Math.max(res, curr);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            int curr = arr[tp] * (stack.isEmpty() ? n : (n - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};
        System.out.println(largestArea(arr));
        System.out.println(area(arr));
    }
}
