import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    RotateArray test = new RotateArray();

    void rotateArray(int[] expected, int[] nums, int k) {
        test.rotate(nums, k);
        System.out.println("expected: " + Arrays.toString(expected));
        System.out.println("actual:   " + Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateZero() {
        rotateArray(new int[]{3, 99, -1, -100}, new int[]{3, 99, -1, -100}, 0);
    }

    @Test
    void rotate1() {
        rotateArray(new int[]{5, 6, 7, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    @Test
    void rotate2() {
        rotateArray(new int[]{3, 99, -1, -100}, new int[]{-1, -100, 3, 99}, 2);
    }

    @Test
    void rotate3() {
        rotateArray(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6);
    }

    @Test
    void rotate4() {
        rotateArray(new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
    }
}