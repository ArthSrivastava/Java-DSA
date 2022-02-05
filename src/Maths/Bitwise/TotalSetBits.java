package Maths.Bitwise;

public class TotalSetBits {
    static int method1(int n)
    {
        int count = 0;
        while(n>0)
        {
            if((n&1) == 1)
            count++;
            n = n>>1;
        }
        return count;
    }

    static int method2(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n = n & (n-1);
        }
        return count;
    }
    static int method3(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n = n - (n & -n);
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 124795;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(method1(n));
        System.out.println(method2(n));
        System.out.println(method3(n));
    }
}
