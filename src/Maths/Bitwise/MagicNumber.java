package Maths.Bitwise;

public class MagicNumber {
    static int magicNumber(int n)
    {
        int base = 5;
        int sum = 0;
        while(n>0)
        {
            int last = n&1;
            n >>= 1;
            sum += base*last;
            base *= 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicNumber(n));
    }
}
