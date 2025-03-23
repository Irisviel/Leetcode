import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SingleNumberTest {
    SingleNumber test = new SingleNumber();

    @Test
    void singleNumber1() {
        int[] nums = new int[]{2, 2, 1};
        assertEquals(1, test.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        assertEquals(4, test.singleNumber(nums));
    }

    @Test
    void singleNumber3() {
        int[] nums = new int[]{1};
        assertEquals(1, test.singleNumber(nums));
    }
}