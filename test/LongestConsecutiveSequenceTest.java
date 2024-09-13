import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive1() {
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void longestConsecutive2() {
        assertEquals(9, LongestConsecutiveSequence.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void longestConsecutive3() {
        assertEquals(3, LongestConsecutiveSequence.longestConsecutive(new int[]{1, 2, 0, 1}));
    }

    @Test
    void longestConsecutive4() {
        assertEquals(2, LongestConsecutiveSequence.longestConsecutive(new int[]{-100, -99, 99, 100}));
    }

    @Test
    void longestConsecutive5() {
        assertEquals(1, LongestConsecutiveSequence.longestConsecutive(new int[]{0}));
    }

    @Test
    void longestConsecutive6() {
        assertEquals(1, LongestConsecutiveSequence.longestConsecutive(new int[]{0, 0}));
    }

    @Test
    void longestConsecutive7() {
        assertEquals(0, LongestConsecutiveSequence.longestConsecutive(new int[0]));
    }
}