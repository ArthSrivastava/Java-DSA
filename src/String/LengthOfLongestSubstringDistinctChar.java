package String;

public class LengthOfLongestSubstringDistinctChar {
    static final int CHAR = 256;
    private static int findLength(String s) {
        int l = s.length();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (areDistinct(s, i, j)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    private static boolean areDistinct(String s, int i, int j) {
        boolean[] visited = new boolean[CHAR];
        for (int k = i; k <= j; k++) {
            if (visited[s.charAt(k)]) {
                return false;
            }
            visited[s.charAt(k)] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abaacdbab";
        System.out.println(findLength(s));
    }
}
