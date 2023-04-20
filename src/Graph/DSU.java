package Graph;

import java.util.Arrays;

public class DSU {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] parent = new int[10];
        int[] size = new int[10];
        int n = nodes.length;
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        DSU dsu = new DSU();
        dsu.union(3, 8, parent, size);
        dsu.union(8, 2, parent, size);
        dsu.union(3, 7, parent, size);

        System.out.println(Arrays.toString(parent));
    }

    private void union(int i, int j, int[] parent, int[] size) {
        int ri = getRoot(i, parent);
        int rj = getRoot(j, parent);
        if(ri == rj) return;
        if(size[ri] >= size[rj]) {
            parent[rj] = ri;
            size[ri] += size[rj];
        } else {
            parent[ri] = rj;
            size[rj] += size[ri];
        }
    }

    private boolean find(int i, int j, int[] parent) {
        return getRoot(i, parent) == getRoot(j, parent);
    }

    private int getRoot(int i, int[] parent) {
        while(parent[i] != i) {
            i = parent[i];
        }
        return i;
    }
}
