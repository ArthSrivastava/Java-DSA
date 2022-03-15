package String;

import java.util.Arrays;

public class CountFreqInSortedOrder {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
//        System.out.println(Arrays.toString(count));
        for (int i = 0; i < 26; i++) {
            //Frequencies in sorted order
            if(count[i] > 0)
                System.out.println((char) (i + 'a') + ":" + count[i]);

            //Sorting a string
//            if(count[i] > 0) {
//                for (int j = 0; j < count[i]; j++) {
//                    System.out.print((char) (i + 'a') + " ");
//                }
//                System.out.println();
//            }
        }
    }
}
