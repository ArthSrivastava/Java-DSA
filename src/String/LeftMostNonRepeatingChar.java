package String;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {
    final static int CHAR = 256;
    private static int getIndex(String s1) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (visited[s1.charAt(i)]) {
                visited[s1.charAt(i)] = false;
            } else {
                visited[s1.charAt(i)] = true;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (visited[s1.charAt(i)]) {
                res = i;
                break;
            }
        }
//        System.out.println(Arrays.toString(visited));
        return res;
    }

    private static int oneTraversal(String s) {
        int[] first = new int[CHAR];
        Arrays.fill(first, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (first[s.charAt(i)] == -1) {
                first[s.charAt(i)] = i;
            } else {
                first[s.charAt(i)] = -2;
            }
        }
        for (int i = 0; i < CHAR; i++) {
            if (first[i] >= 0) {
                res = Math.min(res, first[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(oneTraversal(s));
    }
}
