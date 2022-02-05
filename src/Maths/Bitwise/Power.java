package Maths.Bitwise;

public class Power {
    static int solve(int base, int power)
    {
        int ans = 1;
        while(power>0)
        {
            if ((power & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            power = power>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve(3,5));
    }
}
