/*
 * 653. Two Sum IV - Input is a BST
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 * Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.
 */

import java.util.Stack;

public class TwoSumIVInputIsABST {
    public static boolean findTarget(TreeNode root, int k) {
        if (root.left == null && root.right == null) {
            return false;
        }
        TreeNode current = null;
        TreeNode left = null;
        TreeNode right = null;
        Stack<TreeNode> l = new Stack<>();
        Stack<TreeNode> r = new Stack<>();
        l.push(root);
        r.push(root);

        left = root;
        right = root;
        while (left.left != null)
            left = left.left;
        while (right.right != null)
            right = right.right;

        while (!l.isEmpty()) {
            current = l.pop();
            if (current.val + r.peek().val == k) return true;
            else if ((current.val + right.val > k) && (current.val + left.val < k)) {
                int search = k - current.val;
                TreeNode n = root;
                while (n != null) {
                    if (n.val == search) return true;
                    else if (n.val > search) {
                        n = n.left;
                    } else {
                        n = n.right;
                    }
                }
            }
            if (current.right != null) {
                l.push(current.right);
            }
            if (current.left != null) {
                l.push(current.left);
            }
        }

        return false;
    }
}