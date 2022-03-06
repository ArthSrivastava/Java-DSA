package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PowerSetLexicographic {
    private static ArrayList<String> subsequence(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        ArrayList<String> list = subsequence("", "abc");
        Collections.sort(list);
        System.out.println(list);
    }
}
