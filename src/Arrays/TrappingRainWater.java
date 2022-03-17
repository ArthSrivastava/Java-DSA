package Arrays;

public class TrappingRainWater {
    //Naive solution: O(n^2)
    private static int getWater(int[] heights) {
        int n = heights.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lMax = heights[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, heights[j]);
            }
            int rMax = heights[i];
            for (int k = i + 1; k < n; k++) {
                rMax = Math.max(rMax, heights[k]);
            }
            res += Math.min(lMax, rMax) - heights[i];
        }
        return res;
    }

    //Efficient Solution
    private static int efficientGetWater(int[] heights) {
        int n = heights.length;
        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(heights[i], lMax[i - 1]);
        }
        rMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(heights[i], rMax[i + 1]);
        }
        for (int i = 1; i < n - 1; i++) {
            res += Math.min(rMax[i], lMax[i]) - heights[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] heights = {5, 0, 6, 2, 3};
        System.out.println(getWater(heights));
        System.out.println(efficientGetWater(heights));
    }
}
