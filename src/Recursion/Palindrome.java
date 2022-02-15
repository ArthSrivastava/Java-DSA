package Recursion;

public class Palindrome {
    public static boolean checkPalindrome(String s, int start, int end){
        if(start >= end)
        {
            return true;
        }
        if(s.charAt(start) != s.charAt(end))
            return false;

        return checkPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(checkPalindrome(s,0, s.length() - 1));
    }
}
