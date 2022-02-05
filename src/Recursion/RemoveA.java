package Recursion;

public class RemoveA {

    public static String removeA(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        if(s.charAt(0) == 'a') {
            return removeA(s.substring(1));
        }
        return s.charAt(0) + removeA(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(removeA("baccad"));
    }
}