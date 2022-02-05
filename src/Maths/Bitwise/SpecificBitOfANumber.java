package Maths.Bitwise;

import java.util.Scanner;

public class SpecificBitOfANumber {
    static int findBit(int n, int i)
    {
        int mask = 1 << (i-1);
        if((n&mask)>>(i-1) == 1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();   //1001111
        System.out.println("Enter the bit you want to find:");
        int i = sc.nextInt();
//        System.out.println("Ith bit is:" + findBit(n,i));
        System.out.println((n&(1<<(i-1)))>>(i-1));
    }

}
