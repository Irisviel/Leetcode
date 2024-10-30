/*
 * https://leetcode.com/problems/rotate-array/description/
 * 189. Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 */

public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (k == 0) return;
        int offset = k % nums.length;
        int[] part = new int[offset > nums.length / 2 ? nums.length - offset : offset];
        if (offset > nums.length / 2) {
            System.arraycopy(nums, 0, part, 0, nums.length - offset);
            System.arraycopy(nums, nums.length - offset, nums, 0, offset);
            System.arraycopy(part, 0, nums, offset, nums.length - offset);
        } else {
            System.arraycopy(nums, nums.length - offset, part, 0, offset);
            System.arraycopy(nums, 0, nums, offset, nums.length - offset);
            System.arraycopy(part, 0, nums, 0, offset);
        }
    }
}