package Maths.GeneralMaths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factors(90);
    }

    static void factors(int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i*i <= n; i++)
        {
            if(n%i == 0)
            {
                if (n / i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(0, n/i);
                }
            }
        }
        for (int e : list) {
            System.out.print(e + " ");
        }
    }
}
