package String;

import java.util.ArrayList;
import java.util.List;

public class PatternSearching {

    //NAIVE approach
    private static List<Integer> patternSearch(String txt, String ptn) {
        int l1 = txt.length();
        int l2 = ptn.length();
        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= l1 - l2; i++) {
//            if (txt.substring(i, i + l2).equals(ptn)) {
//                list.add(i);
//            }
//        }
        for (int i = 0; i <= l1 - l2; i++) {
            int j;
            for (j = 0; j < l2; j++) {
                if (ptn.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == l2) {
                list.add(i);
            }
        }
        return list;
    }

    //NAIVE improved approach if the pattern has all distinct characters
    private static void pattSearchDist(String txt, String ptn) {
        int l1 = txt.length();
        int l2 = ptn.length();
        for (int i = 0; i <= l1 - l2; ) {
            int j;
            for (j = 0; j < l2; j++) {
                if (ptn.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == l2) {
                System.out.print(i + " ");
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }
    public static void main(String[] args) {
        String txt = "ABCEABEFABCD";
        String ptn = "ABCD";
        List<Integer> list = patternSearch(txt, ptn);
        if (list.size() == 0) {
            System.out.println("Not present");
        } else {
            System.out.println(list);
        }
        pattSearchDist(txt, ptn);
    }
}
