import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumIVInputIsABSTTest {

    @Test
    void findTarget1() {
        assertEquals(true, TwoSumIVInputIsABST.findTarget(TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    }

    @Test
    void findTarget2() {
        assertEquals(false, TwoSumIVInputIsABST.findTarget(TreeNode.fromArray(new Integer[]{5, 3, 6, 2, 4, null, 7}), 28));
    }

    @Test
    void findTarget3() {
        assertEquals(true, TwoSumIVInputIsABST.findTarget(TreeNode.fromArray(new Integer[]{2, 0, 3, -4, 1}), -1));
    }

    @Test
    void findTarget4() {
        assertEquals(false, TwoSumIVInputIsABST.findTarget(TreeNode.fromArray(new Integer[]{2, null, 3}), 6));
    }

    @Test
    void findTarget5() {
        assertEquals(false, TwoSumIVInputIsABST.findTarget(TreeNode.fromArray(new Integer[]{1, null, 2}), 2));
    }
}