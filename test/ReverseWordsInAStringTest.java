import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {
    ReverseWordsInAString test = new ReverseWordsInAString();

    @Test
    void reverseWords1() {
        String input = "the sky is blue";
        String output = test.reverseWords(input);
        assertEquals("blue is sky the", output);
    }

    @Test
    void reverseWords2() {
        String input = "  hello world  ";
        String output = test.reverseWords(input);
        assertEquals("world hello", output);    // Your reversed string should not contain leading or trailing spaces.
    }

    @Test
    void reverseWords3() {
        String input = "a good   example";
        String output = test.reverseWords(input);
        assertEquals("example good a", output);    // You need to reduce multiple spaces between two words to a single space in the reversed string.
    }

    @Test
    void reverseWords4() {
        String input = "a";
        String output = test.reverseWords(input);
        assertEquals("a", output);    // You need to reduce multiple spaces between two words to a single space in the reversed string.
    }
}