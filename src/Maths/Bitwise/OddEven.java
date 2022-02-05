package Maths.Bitwise;

public class OddEven {
    static boolean isOddEven(int n)
    {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        if (isOddEven(1)) {
            System.out.print("Even");
        }
        else
            System.out.println("Odd");
    }
}
