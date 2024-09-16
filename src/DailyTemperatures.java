/*
 * 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/description/
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
 * is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Queue<Day> queue = new PriorityQueue<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!queue.isEmpty() && temperatures[i] > queue.peek().temp) {
                Day day = queue.poll();
                result[day.index] += i - day.index;
            }
            queue.add(new Day(i, temperatures[i]));
        }
        return result;
    }
}
