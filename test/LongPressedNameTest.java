import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongPressedNameTest {

    @Test
    void isLongPressedName01() {
        assertEquals(true, LongPressedName.isLongPressedName("alex", "aaleex"));
    }

    @Test
    void isLongPressedName02() {
        assertEquals(false, LongPressedName.isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    void isLongPressedName03() {
        assertEquals(true, LongPressedName.isLongPressedName("john", "jjoohn"));
    }

    @Test
    void isLongPressedName04() {
        assertEquals(true, LongPressedName.isLongPressedName("potato", "potato"));
    }

    @Test
    void isLongPressedName05() {
        assertEquals(true, LongPressedName.isLongPressedName("marie", "marieeee"));
    }

    @Test
    void isLongPressedName06() {
        assertEquals(true, LongPressedName.isLongPressedName("mariee", "marieeee"));
    }

    @Test
    void isLongPressedName07() {
        assertEquals(true, LongPressedName.isLongPressedName("mariee", "marieeee"));
    }

    @Test
    void isLongPressedName08() {
        assertEquals(false, LongPressedName.isLongPressedName("marie", "mariw"));
    }

    @Test
    void isLongPressedName09() {
        assertEquals(true, LongPressedName.isLongPressedName("bob", "bbbbbob"));
    }

    @Test
    void isLongPressedName10() {
        assertEquals(false, LongPressedName.isLongPressedName("alex", "aaleexa"));
    }

    @Test
    void isLongPressedName11() {
        assertEquals(false, LongPressedName.isLongPressedName("pyplrz", "ppyypllr"));
    }

    @Test
    void isLongPressedName12() {
        assertEquals(false, LongPressedName.isLongPressedName("bdad", "bbbd"));
    }

    @Test
    void isLongPressedName13() {
        assertEquals(false, LongPressedName.isLongPressedName("alex", "aaleelx"));
    }

    @Test
    void isLongPressedName14() {
        assertEquals(false, LongPressedName.isLongPressedName("alice", "elice"));
    }
}