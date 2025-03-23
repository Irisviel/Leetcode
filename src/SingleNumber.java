/*
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Constraints:
 * 1 <= nums.length <= 3 * 10e4
 * -3 * 10e4 <= nums[i] <= 3 * 10e4
 * Each element in the array appears twice except for one element which appears only once.
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
