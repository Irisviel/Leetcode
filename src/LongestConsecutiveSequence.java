/*
 * 128. Longest Consecutive Sequence
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * 0 <= nums.length <= 10e5
 * -10e9 <= nums[i] <= 10e9
 */

import structs.DataSetUnionHashed;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        DataSetUnionHashed data = new DataSetUnionHashed(nums.length);
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        data.index = map;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                data.parent[i] = nums[i];
                map.put(nums[i], i);
                if (map.containsKey(nums[i] - 1)) {
                    data.Union(nums[i] - 1, nums[i]);
                }
                if (map.containsKey(nums[i] + 1)) {
                    data.Union(nums[i] + 1, nums[i]);
                }
            }
        }
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maximum = Math.max(maximum, data.max[i]);
        }
        return maximum;
    }
}
