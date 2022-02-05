package Recursion;

public class RemoveApple {
    static String remove(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if(s.length()>=5 && s.startsWith("apple"))
        {
            return remove(s.substring(5));
        }
        return s.charAt(0) + remove(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(remove("bcappleade"));
    }
}
