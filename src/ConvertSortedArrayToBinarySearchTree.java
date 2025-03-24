/*
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * Constraints:
 * 1 <= nums.length <= 10e4
 * -10e4 <= nums[i] <= 10e4
 * nums is sorted in a strictly increasing order.
 */

import structs.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = formSubtree(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode formSubtree(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = formSubtree(nums, start, mid - 1);
        root.right = formSubtree(nums, mid + 1, end);
        return root;
    }
}
