import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LongestSubarrayOfOnesAfterDeletingOneElementTest {

    LongestSubarrayOfOnesAfterDeletingOneElement test = new LongestSubarrayOfOnesAfterDeletingOneElement();

    @Test
    void longestSubarray1() {
        // After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
        int[] nums = {1, 1, 0, 1};
        assertEquals(3, test.longestSubarray(nums));
    }

    @Test
    void longestSubarray2() {
        // After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertEquals(5, test.longestSubarray(nums));
    }

    @Test
    void longestSubarray3() {
        // You must delete one element.
        int[] nums = {1, 1, 1};
        assertEquals(2, test.longestSubarray(nums));
    }

    @Test
    void longestSubarray4() {
        int[] nums = {0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0};
        assertEquals(5, test.longestSubarray(nums));
    }

    @Test
    void longestSubarray5() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0};
        assertEquals(5, test.longestSubarray(nums));
    }

    @Test
    void stressTest1() {
        Random rnd = new Random();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextBoolean() ? 1 : 0;
        }
        long start = System.currentTimeMillis();
        test.longestSubarray(nums);
        long stop = System.currentTimeMillis();
        Assertions.assertTrue(stop - start < 100);
    }
}