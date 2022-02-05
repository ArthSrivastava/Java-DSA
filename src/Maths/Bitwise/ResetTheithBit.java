package Maths.Bitwise;

public class ResetTheithBit {
    public static void main(String[] args) {
        int n = 79;
        int bit = 3;
        int mask = 1 << (bit - 1);
        System.out.println(n&(~(mask)));
    }
}
