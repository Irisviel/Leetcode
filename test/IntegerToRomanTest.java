import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanTest {

    IntegerToRoman test = new IntegerToRoman();

    @Test
    void intToRoman1() {
        assertEquals("MMMDCCXLIX", test.intToRoman(3749));
    }

    @Test
    void intToRoman2() {
        assertEquals("LVIII", test.intToRoman(58));
    }

    @Test
    void intToRoman3() {
        assertEquals("MCMXCIV", test.intToRoman(1994));
    }

    @Test
    void intToRomanMin() {
        assertEquals("I", test.intToRoman(1));
    }

    @Test
    void intToRomanMax() {
        assertEquals("MMMCMXCIX", test.intToRoman(3999));
    }

    @Test
    void intToRomanOneSymbol() {
        for (int i = 0; i < IntegerToRoman.ROMAN.length; i++) {
            assertEquals(IntegerToRoman.ROMAN[i], test.intToRoman(IntegerToRoman.INTEGERS[i]));
        }
    }
}