package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        int rem, c, c1, temp;
        for(int i=left; i<=right; i++)
        {
            c=0;
            c1=0;
            temp = i;
            while(temp!=0)
            {
                rem = temp%10;
                if(rem!=0 && (i%rem == 0))
                {
                    c++;
                }
                c1++;
                temp/=10;
            }
            if(c==c1)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(11,22));
    }
}
