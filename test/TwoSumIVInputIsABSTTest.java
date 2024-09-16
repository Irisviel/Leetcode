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
}