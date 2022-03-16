package String;

public class CheckStringRotations {
    private static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "ABAB";
        String s2 = "ABBA";
        System.out.println(checkRotation(s1, s2));
    }
}
