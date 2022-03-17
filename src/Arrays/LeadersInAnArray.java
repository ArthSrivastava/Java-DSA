package Arrays;

import java.util.ArrayList;

public class LeadersInAnArray {
    private static ArrayList<Integer> leaders(int[] arr) {
        int n = arr.length;
        int curr_ldr = arr[n - 1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(curr_ldr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr_ldr) {
                curr_ldr = arr[i];
                list.add(0, curr_ldr);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        System.out.println(leaders(arr));
    }
}
