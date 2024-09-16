import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    FindTheIndexOfTheFirstOccurrenceInAString test = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void strStr1() {
        assertEquals(0, test.strStr("sadbutsad", "sad"));
    }

    @Test
    void strStr2() {
        assertEquals(-1, test.strStr("leetcode", "leeto"));
    }

    @Test
    void strStr3() {
        assertEquals(3, test.strStr("bbbaaa", "a"));
    }

    @Test
    void strStr4() {
        assertEquals(-1, test.strStr("foobar", "arr"));
    }

    @Test
    void strStr5() {
        assertEquals(0, test.strStr("foobar", "foobar"));
    }

    @Test
    void strStr6() {
        assertEquals(6, test.strStr("sampamampleq", "ample"));
    }

    @Test
    void strStr7() {
        assertEquals(4, test.strStr("mississippi", "issip"));
    }
}