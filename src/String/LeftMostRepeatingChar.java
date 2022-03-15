package String;

import java.util.Arrays;

public class LeftMostRepeatingChar {
    static final int CHAR = 256;
    private static int getLeftMostRepeatingCharIndex(String s1) {
        int[] count = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
//        int temp = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (count[s1.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }

    private static int efficient1(String s1) {
        int l = s1.length();
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            int fi = fIndex[s1.charAt(i)];
            if (fi == -1) {
                fIndex[s1.charAt(i)] = i;
            } else {
                res = Math.min(res, fi);
            }
        }
        return (res == Integer.MAX_VALUE)? -1 : res;
    }

    private static int efficient2(String s1) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (visited[s1.charAt(i)]) {
                res = i;
            } else {
                visited[s1.charAt(i)] = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(efficient2(s));
    }
}
