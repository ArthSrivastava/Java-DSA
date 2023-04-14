package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubstringsHavingAllUniqueCharacters {
    public static void main(String[] args) {
        String s = "aabcbcdbca";
        int l = s.length();
        System.out.println(countSubstrings(s, l));
    }

    private static int countSubstrings(String s, int l) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int count = 0;
        while(j < l) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.size() == (j - i + 1)) {
                count += j - i + 1;
            } else {
                while((j - i + 1) > map.size()) {
                    char currChar = s.charAt(i);
                    map.put(currChar, map.get(currChar) - 1);
                    if(map.get(currChar) == 0) {
                        map.remove(currChar);
                    }
                    i++;
                }
                count += j - i + 1;
            }
            j++;
        }
        return count;
    }
}
