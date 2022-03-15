package String;

public class CheckSubseq {
    private static boolean iterative(String s1, String s2) {
        int first = 0, second = 0;
        while (first < s1.length() && second < s2.length()) {
            if (s1.charAt(first) == s2.charAt(second)) {
                second++;
            }
            first++;
        }
        return second == s2.length();
    }

    private static boolean recursive(String s1, String s2, int m, int n) {
        if (n == 0) {
            return true;
        }
        if (m == 0) {
            return false;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return recursive(s1, s2, --m, --n);
        } else {
            return recursive(s1, s2, --m, n);
        }
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "C";
        System.out.println(iterative(s1, s2));
        System.out.println(recursive(s1, s2, s1.length(), s2.length()));
    }
}
