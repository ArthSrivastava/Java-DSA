package String;

public class ReverseWordsInAString {
    private static void revWords(char[] s) {
        int l = s.length;
        int start = 0;
        for (int end = 0; end < l; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }
            reverse(s, start,l - 1);
            reverse(s, 0, l - 1);
    }

    private static void reverse(char[] s, int start, int end) {
        while (start <= end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "geeks for coders";
        char[] str = s.toCharArray();
        revWords(str);
        s = new String(str);
        System.out.println(s);
    }
}
