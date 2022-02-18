package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceTargetSum {
    private static List<String> combinations(String p, int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++)
        {
            res.addAll(combinations(p + i, target - i));
        }
        return res;
    }

    private static List<String> combinationsFaces(String p, int target, int faces)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i = 1; i <= faces && i <= target; i++)
        {
            res.addAll(combinations(p + i, target - i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(combinations("", 6));
    }
}
