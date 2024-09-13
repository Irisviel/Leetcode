package structs;

import java.util.Map;

public class DataSetUnionHashed {
    public int[] parent;     // parent
    public int[] rank;  // rank
    public int[] max;
    public Map<Integer, Integer> index;

    public DataSetUnionHashed(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = Integer.MIN_VALUE;
        }
        rank = new int[size];
        max = new int[size];
        for (int i = 0; i < size; i++) {
            max[i] = 1;
        }
    }

    public void Init(int x) {
        parent[x] = x;
    }

    public int Find(int x) {
        if (parent[index.get(x)] == x) return x;
        return parent[index.get(x)] = Find(parent[index.get(x)]);
    }

    public void Union(int x, int y) {
        x = Find(x);
        y = Find(y);
        if (x == y) return;
        if (rank[index.get(x)] < rank[index.get(y)]) {
            parent[index.get(x)] = y;
            max[index.get(y)] += max[index.get(x)];
        } else {
            parent[index.get(y)] = x;
            max[index.get(x)] += max[index.get(y)];
            if (rank[index.get(x)] == rank[index.get(y)]) {
                rank[index.get(x)]++;
            }
        }
    }
}
