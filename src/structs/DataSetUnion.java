package structs;

public class DataSetUnion {
    public int[] p;     // parent
    public int[] rank;  // rank

    public DataSetUnion(int size) {
        p = new int[size];
        for (int i = 0; i < size; i++) {
            p[i] = i;
        }
        rank = new int[size];
    }

    public void Init(int x) {
        p[x] = x;
    }

    public int Find(int x) {
        if (p[x] == x) return x;
        return p[x] = Find(p[x]);
    }

    public void Union(int x, int y) {
        x = Find(x);
        y = Find(y);
        if (x == y) return;
        if (rank[x] < rank[y]) {
            p[x] = y;
        } else {
            p[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }
}
