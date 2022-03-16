package String;

public class AnagramSearch {
    static final int CHAR = 256;

    private static boolean isPresent(String txt, String ptn) {
        int l1 = txt.length();
        int l2 = ptn.length();
        for (int i = 0; i <= l1 - l2; i++) {
            if (isAnagram(txt, ptn, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAnagram(String txt, String ptn, int k) {
        int[] count = new int[CHAR];
        for (int i = 0; i < ptn.length(); i++) {
            count[txt.charAt(k + i)]++;
            count[ptn.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean efficient(String txt, String ptn) {
        int[] cp = new int[CHAR];
        int[] ct = new int[CHAR];
        for (int i = 0; i < ptn.length(); i++) {
            ct[txt.charAt(i)]++;
            cp[ptn.charAt(i)]++;
        }

        for (int i = ptn.length(); i < txt.length(); i++) {
            if (areSame(cp, ct)) {
                return true;
            }
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i - ptn.length())]--;
        }
        return false;
    }

    private static boolean areSame(int[] cp, int[] ct) {
        for (int i = 0; i < CHAR; i++) {
            if (cp[i] != ct[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String ptn = "frog";
        System.out.println(efficient(txt, ptn));
    }
}
