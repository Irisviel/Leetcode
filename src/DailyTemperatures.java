/*
 * 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/description/
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
 * is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DailyTemperatures {

    // Not working, need to take order into account.
    public static int[] dailyTemperatures(int[] temperatures) {
        int range = 71;
        int min = 30;
        int[] result = new int[temperatures.length];
        ArrayList<LinkedList<Integer>> temp = new ArrayList<>(range);      // Day array of index lists. One day contains rolling list of indexes from input data.
        PriorityQueue<Integer> lows = new PriorityQueue<>();    // Queue of met low temperatures.

        for (int i = 0; i < range; i++) {
            temp.add(new LinkedList<>());
        }
        int[] days = new int[range];                       // Days since specified temperature.

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("input: " + temperatures[i]);
            temp.get(temperatures[i] - min).add(i);
//            days[temperatures[i] - min]++;

            lows.add(temperatures[i]);
            int sum = 0;
            while (lows.peek() < temperatures[i]) {
                Integer low = lows.poll();
                sum += days[low - min];
                for (Integer index : temp.get(low - min)) {
                    result[index] = sum;
                }
            }
            for (int j = 0; j < temperatures[i] - min; j++) {         // Clean up lower temperatures.
                temp.get(j).clear();
                days[j] = 0;
                int lowerTemp = j;
//                lows.removeIf(x -> x < lowerTemp + min + 1);
            }
            for (Integer low : lows) {
                days[low - min]++;
            }
            printTemp(temp);
            printDays(days);
            printLows(lows);
            System.out.println("result: " + Arrays.toString(result));
            System.out.println();
        }
        return result;
    }


    public static void printTemp(ArrayList<LinkedList<Integer>> temp) {
        System.out.println("temp:");
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).size() > 0) {
                System.out.print(i + 30 + ": ");
//                System.out.print(i + 31 + ": ");
                for (Integer j : temp.get(i)) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    public static void printDays(int[] days) {
        System.out.println("days:");
        for (int i = 0; i < days.length; i++) {
            if (days[i] > 0) {
                System.out.print((i + 30) + ": " + days[i]);
                System.out.println();
            }
        }
    }

    public static void printLows(PriorityQueue<Integer> lows) {
        System.out.println("lows:");
        for (Integer i : lows) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
