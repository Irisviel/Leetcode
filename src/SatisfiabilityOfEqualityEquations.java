/*
 * https://leetcode.com/problems/satisfiability-of-equality-equations/description/
 */

import java.util.*;
import java.util.stream.Collectors;

public class SatisfiabilityOfEqualityEquations {
    public static boolean equationsPossible(String[] equations) {
        int size = 26;
        DataSetUnion m = new DataSetUnion(size);

        for (String line : equations) {
            int first = line.charAt(0) - 97;
            int second = line.charAt(3) - 97;
            boolean equal = line.charAt(1) == '=';
            if (equal) {
                m.Union(first, second);
            }

        }
//        for (int i = 0; i < m.p.length; i++) {
//            System.out.print(m.p[i] + " ");
//        }
//        System.out.println();
        for (String line : equations) {
            int first = line.charAt(0) - 97;
            int second = line.charAt(3) - 97;
            boolean equal = line.charAt(1) == '=';
            if (!equal) {
                if (m.Find(first) == m.Find(second)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean equationsPossibleV1(String[] equations) {
        int size = 26;  // alphabet
        System.out.println(size);
        int[] groups = new int[size];
        int groupOffset = 1;
        List<E> pros = new ArrayList<>();
        List<E> cons = new ArrayList<>();
        Map<Integer, Integer[]> arr = new HashMap<>();

        for (String line : equations) {
            int first = line.charAt(0) - 97;
            System.out.println(first);
            int second = line.charAt(3) - 97;
            System.out.println(second);
            boolean equal = line.charAt(1) == '=';
            if (equal) pros.add(new E(first, second, true));
            else cons.add(new E(first, second, false));
        }
        System.out.println();
        for (E e : pros) {
            if ((groups[e.first] == 0) && (groups[e.second] == 0)) {
                groups[e.first] = groupOffset;
                groups[e.second] = groupOffset;
                groupOffset++;
            } else if (groups[e.first] == 0) {
                groups[e.first] = groups[e.second];
            } else if (groups[e.second] == 0) {
                groups[e.second] = groups[e.first];
            } else if (groups[e.first] != groups[e.second]) {
                int old = groups[e.second];
                for (int j = 0; j < groups.length; j++) {
                    if (groups[j] == old) {
                        groups[j] = groups[e.first];
                    }
                }
            }
        }
        for (E e : cons) {
            if ((groups[e.first] == 0) && (groups[e.second] == 0)) {
                groups[e.first] = groupOffset;
                groupOffset++;
                groups[e.second] = groupOffset;
                groupOffset++;
            }
        }
        for (int k : groups) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = 0; i < groups.length; i++) {
            List<Integer> sameGroupNodes = new ArrayList<>();
            for (int j = 0; j < groups.length; j++) {
                if ((groups[j] == groups[i]) && (groups[j] != 0)) {
                    sameGroupNodes.add(j);
                }
            }
            arr.put(i, sameGroupNodes.toArray(new Integer[0]));
            System.out.printf("%s: %s%n", i, Arrays.stream(arr.get(i)).map(Object::toString).collect(Collectors.joining(" ")));
        }
        for (E con : cons) {
            Integer[] group = arr.get(con.second);
            if (Arrays.asList(group).contains(con.first)) {
                return false;
            }
        }
        return true;
    }

    public static class DataSetUnion {
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

    public static class E {
        public int first;
        public int second;
        public boolean equal;

        public E(int first, int second, boolean equal) {
            this.first = first;
            this.second = second;
            this.equal = equal;
        }
    }
}
