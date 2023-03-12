package Recursion;


import java.util.ArrayList;

public class PermutationsOfString {

    private static void permutation(String up, String p)
    {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(up.substring(1), f + ch + s);
        }
    }

    private static ArrayList<String> permutationList(String up, String p)
    {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            res.addAll(permutationList(up.substring(1), f + ch + s));
        }
        return res;
    }

    private static int permutationCount(String up, String p)
    {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationCount(up.substring(1), f + ch + s);
        }
        return count;
    }
    public static void main(String[] args) {
//        ArrayList<String> list = permutationList("abc", "");
//        System.out.println(list);
//        permutation("abc", "");
        System.out.println(permutationCount("ab", ""));
    }
}
