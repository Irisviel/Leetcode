import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord1() {
        assertEquals(5, LengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord2() {
        assertEquals(4, LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWord3() {
        assertEquals(6, LengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}