package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        List<List<Integer>> ans = subsetDuplicate(new int[]{1,2,2});
//        for(List<Integer> li: ans)
//            System.out.print(li + ",");
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr)
        {
            int n = outer.size();
            for(int i=0; i<n; i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) //First method
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++)
        {
            int n = outer.size();
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = n - 1;
            for(int j=start; j<n; j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate2(int[] arr) //Method 2 partially correct since {1,2} = {2,1}
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr)
        {
            int n = outer.size();
            for(int i=0; i<n; i++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(outer.contains(internal))
                    continue;
                outer.add(internal);
            }
        }
        return outer;
    }
}
