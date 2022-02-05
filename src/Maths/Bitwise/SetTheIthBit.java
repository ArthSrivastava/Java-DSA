package Maths.Bitwise;

import java.util.Scanner;

public class SetTheIthBit {
    //1001111:79
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();   //1001111
        System.out.println("Enter the bit you want to set:");
        int i = sc.nextInt();
        int mask = (1<<(i-1));
        System.out.println((n|mask));
    }
}
