package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abba";
        int l = s.length();
        boolean isPalindrome = true;
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                isPalindrome = false;
                break; 
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
