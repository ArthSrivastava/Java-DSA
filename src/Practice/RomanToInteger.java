package Practice;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String s = "MCMXCIV";
//        map.put("I", 1);
//        map.put("V", 5);
//        map.put("X", 10);
//        map.put("L", 50);
//        map.put("C", 100);
//        map.put("D", 500);
//        map.put("M", 1000);
//        map.put("IV", 4);
//        map.put("IX", 9);
//        map.put("XL", 40);
//        map.put("XC", 90);
//        map.put("CD", 400);
//        map.put("CM", 900);
//        int l = s.length();
//        int sum = 0;
//        StringBuilder sb = new StringBuilder(s);
//        for(int i=0; i<l; )
//        {
//            if(i<l-1 && map.containsKey(sb.substring(i,i+2)))
//            {
//                sum += map.get(sb.substring(i,i+2));
//                i+=2;
//                continue;
//            }
//            sum += map.get(sb.substring(i,i+1));
//            i++;
//        }
//        System.out.println(sum);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int l = s.length();
        int sum = 0;
        char prev = s.charAt(0);
        sum += map.get(prev);
        for(int i=1; i<l; i++)
        {
            char curr = s.charAt(i);
            if(map.get(curr) > map.get(prev))
            {
                sum -= 2*map.get(prev);
            }
            sum += map.get(curr);
            prev = curr;
        }
        System.out.println(sum);
    }
}
