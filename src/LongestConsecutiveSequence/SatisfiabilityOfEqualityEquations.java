/*
 * https://leetcode.com/problems/satisfiability-of-equality-equations/description/
 * You are given an array of strings equations that represent relationships between variables where each string equations[i] is of length 4
 * and takes one of two different forms: "x==y" or "x!=y".Here, x and y are lowercase letters (not necessarily different) that represent one-letter variable names.
 * Return true if it is possible to assign integers to variable names so as to satisfy all the given equations, or false otherwise.
 */

package LongestConsecutiveSequence;

import structs.DataSetUnion;

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
        List<EquationUnit> pros = new ArrayList<>();
        List<EquationUnit> cons = new ArrayList<>();
        Map<Integer, Integer[]> arr = new HashMap<>();

        for (String line : equations) {
            int first = line.charAt(0) - 97;
            System.out.println(first);
            int second = line.charAt(3) - 97;
            System.out.println(second);
            boolean equal = line.charAt(1) == '=';
            if (equal) pros.add(new EquationUnit(first, second, true));
            else cons.add(new EquationUnit(first, second, false));
        }
        System.out.println();
        for (EquationUnit e : pros) {
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
        for (EquationUnit e : cons) {
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
        for (EquationUnit con : cons) {
            Integer[] group = arr.get(con.second);
            if (Arrays.asList(group).contains(con.first)) {
                return false;
            }
        }
        return true;
    }
}
