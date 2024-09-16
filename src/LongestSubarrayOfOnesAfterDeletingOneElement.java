/*
 * 1493. Longest Subarray of 1's After Deleting One Element
 * Given a binary array nums, you should delete one element from it.
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array.
 * Return 0 if there is no such subarray.
 */

public class LongestSubarrayOfOnesAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {
        int i = 0;
        int length = 0;
        int max = 0;
        boolean zero = false;
        boolean zeroPresentInput = false;
        int start = 0;
        while (i < nums.length && nums[i] == 0) {
            i++;
        }
        if (i == nums.length) return 0;
        if (i != 0) {
            zeroPresentInput = true;
        }
        while (i < nums.length) {
            int j = i;
            while (j < nums.length) {
                if (nums[j] == 1) {
                    j++;
                    length++;
                } else {
                    zeroPresentInput = true;
                    if (!zero && (j + 1 < nums.length) && nums[j + 1] == 1) {
                        zero = true;
                        j++;
                        start = j;
                    } else if (!zero && (j + 1 == nums.length)) {
                        return Math.max(length, max);
                    } else if (!zero && (j + 1 < nums.length) && nums[j + 1] == 0) {
                        max = Math.max(length, max);
                        length = 0;
                        j++;
                        i = j;
                        break;
                    } else if (zero) {
                        zero = false;
                        max = Math.max(length, max);
                        length = 0;
                        i = start;
                        break;
                    }
                }
            }
            if (j == nums.length) {
                if (!zeroPresentInput) return nums.length - 1;
                return Math.max(length, max);
            }
        }
        return max;
    }
}
