package Maths.Bitwise;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementInArrayOddTimes {
    public static void main(String[] args) {
        int []arr = {2,4,3,3,2,2,3,1,1,1};
        System.out.println(uniqueElement(arr));
    }

    static int uniqueElement(int []arr)
    {
        List<Integer> li = new ArrayList<>();
        for(int num: arr)
        {
            int countBit = 0;
            int countSetBit = 0;
            while(num>0)
            {
                countBit++;
                if((num&1) == 1)
                {

                    countSetBit++;
                }
                num = num>>1;
            }

        }
        return 1;
    }
}
