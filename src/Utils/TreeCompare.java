package Utils;

import structs.TreeNode;

public class TreeCompare {
    public static boolean compare(TreeNode expected, TreeNode actual) {
        if (expected.val != actual.val) return false;
        if (expected.left == null ^ actual.left == null) {
            return false;
        } else if (expected.left != null) {
            compare(expected.left, actual.left);
        }
        if (expected.right == null ^ actual.right == null) {
            return false;
        } else if (expected.right != null) {
            compare(expected.right, actual.right);
        }
        return true;
    }
}
