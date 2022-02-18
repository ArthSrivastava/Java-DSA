package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    private static List<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if(!(p.isEmpty()))
                list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> res = new ArrayList<>();
        if(digit == 7)
        {
            for(int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++)
            {
                char ch = (char)('a' + i);
                res.addAll(letterCombinations(p + ch, up.substring(1)));
            }
        }
        else if(digit == 8)
        {
            for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++)
            {
                char ch = (char)('a' + i);
                res.addAll(letterCombinations(p + ch, up.substring(1)));
            }
        }
        else if(digit == 9)
        {
            for(int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3 + 1; i++)
            {
                char ch = (char)('a' + i);
                res.addAll(letterCombinations(p + ch, up.substring(1)));
            }
        }
        else
        {
            for(int i = (digit - 2) * 3; i <= (digit - 1) * 3 - 1; i++)
            {
                char ch = (char)('a' + i);
                res.addAll(letterCombinations(p + ch, up.substring(1)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("", ""));
    }
}
