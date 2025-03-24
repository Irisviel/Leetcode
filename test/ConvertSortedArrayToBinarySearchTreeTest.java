import Utils.TreeCompare;
import org.junit.jupiter.api.Test;
import structs.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertSortedArrayToBinarySearchTreeTest {
    ConvertSortedArrayToBinarySearchTree test = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void singleNumber1() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        // One possible option
        TreeNode AA = new TreeNode(-10);
        TreeNode AB = new TreeNode(-3);
        TreeNode AC = new TreeNode(0);
        TreeNode AD = new TreeNode(5);
        TreeNode AE = new TreeNode(9);
        AC.left = AB;
        AC.right = AE;
        AB.left = AA;
        AE.left = AD;

        // Alternative option
        TreeNode BA = new TreeNode(-10);
        TreeNode BB = new TreeNode(-3);
        TreeNode BC = new TreeNode(0);
        TreeNode BD = new TreeNode(5);
        TreeNode BE = new TreeNode(9);
        BC.left = BA;
        BC.right = BD;
        BA.right = BB;
        BD.right = BE;

        TreeNode actual = test.sortedArrayToBST(nums);
        assertEquals(true, TreeCompare.compare(AC, actual) || TreeCompare.compare(BC, actual));
    }
}