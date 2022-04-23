package Stack.PracticeProblems;

import java.util.Stack;
import java.util.Arrays;
public class LargestRectangleWithAll1s {

    private static int getLargestRectangle(int[][] arr) {
        int n = arr.length;
        int res = area(arr[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                }
            }
        res =  Math.max(res, area(arr[i]));
        }
        return res;
    }

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
        //If next smaller does not exist
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            int curr = arr[tp] * (stack.isEmpty() ? n : (n - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 1, 1},
                       {0, 0, 0, 1, 1},
                       {1, 1, 1, 1, 1},
                       {0, 1, 1, 1, 1}};
        System.out.println(getLargestRectangle(arr));
    }
}
