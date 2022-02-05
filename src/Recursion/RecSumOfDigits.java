package Recursion;

public class RecSumOfDigits {
    static int sum = 0;
    static int sumOfDigits(int n) {
        if (n/10 == 0)
            return n;
        sum = 0;
        while(n!=0) {
            sum = sum + (n % 10);
            n = n/10;
        }
        return sumOfDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(0));
    }

}
