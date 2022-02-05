package Maths.Bitwise;

public class XORaTob {
    static int xor(int a)
    {
        if(a%4==0)
            return a;
        else if(a%4 == 1)
            return 1;
        else if(a%4 == 2)
            return a+1;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        int a = 3, b = 9;
        System.out.println(xor(a-1) ^ xor(b));
    }

}
