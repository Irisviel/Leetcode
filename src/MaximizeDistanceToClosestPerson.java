/*
 * https://leetcode.com/problems/maximize-distance-to-closest-person/description/
 */

public class MaximizeDistanceToClosestPerson {
    public static int maxDistToClosest(int[] seats) {
        int max = 0;
        int start = 0;
        int current = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                current++;
                if (i == seats.length - 1) {
                    if (start != 0) {
                        if (current > (max + 1) / 2) {
                            max = current;
                            start = seats.length - max;
                        } else if (current == max) {
                            start = seats.length - max;
                        }
                    } else {
                        if (current > max) {
                            max = current;
                            start = seats.length - max;
                        } else if (current == max) {
                            start = seats.length - max;
                        }
                    }
                }
            } else {
                if (start != 0) {
                    if (current > max) {
                        max = current;
                        start = i - max;
                    }
                } else {
                    if ((current + 1) / 2 > max) {
                        max = current;
                        start = i - max;
                    }
                }
                current = 0;
            }
        }
        if ((start == 0) || (start + max == seats.length)) return max;
        return (max + 1) / 2;
    }
}
