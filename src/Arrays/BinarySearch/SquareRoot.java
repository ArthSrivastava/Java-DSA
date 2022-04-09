package Arrays.BinarySearch;

public class SquareRoot {
    private static int getSquareRoot(int x) {
        int low = 1, high = x;
        int root = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long p = (long) mid * mid;
            if (p == x) {
                root = mid;
                break;
            } else if (p < x) {
                root = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println(getSquareRoot(n));
    }
}
