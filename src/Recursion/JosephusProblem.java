package Recursion;

public class JosephusProblem {
    private static int safePos(int n, int k) {
        if(n == 1)
            return 0;

        return (safePos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(safePos(2, 1));
    }
}
