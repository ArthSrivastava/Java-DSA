package Practice;

import java.util.HashSet;

public class HappyNumber {
   static HashSet<Integer> set = new HashSet();

    public static boolean helper(int n)
    {
        int sum = 0;
        if(n == 1)
        {
            return true;
        }
        while(n != 0)
        {
            int r = n % 10;
            sum += Math.pow(r,2);
            n = n / 10;
        }
        if(set.contains(sum))
        {
            return false;
        }
        set.add(sum);
        System.out.print(set + ",");
        return helper(sum);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(helper(n));
    }
}
