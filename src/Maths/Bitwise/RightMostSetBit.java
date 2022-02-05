package Maths.Bitwise;

public class RightMostSetBit {
    static void method1(int n) {
        int mask = 1;
        int count = 0;
        while (n>0) {
            count++;
            if ((n & mask) == 1) {
                System.out.println(count);
                break;
            }
            n = n>>1;
        }
    }
    static int method2(int n)
    {
        return (int)(Math.log10(n & -n)/Math.log10(2)) + 1;
    }

    public static void main(String[] args) {
        int n = 22;
       method1(n); //method 1
//        System.out.println(method2(n));
    }
}
