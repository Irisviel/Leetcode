import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SimplifiableAssertion")
class WordPatternTest {

    WordPattern test = new WordPattern();

    @Test
    void wordPatternOne() {
        assertEquals(true, test.wordPattern("a", "capybara"));
    }

    @Test
    void wordPattern1() {
        assertEquals(true, test.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void wordPattern2() {
        assertEquals(false, test.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void wordPattern3() {
        assertEquals(false, test.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    void wordPattern4() {
        assertEquals(false, test.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    void wordPattern5() {
        assertEquals(true, test.wordPattern("abyz", "dog cat fish duck"));
    }

    @Test
    void wordPattern6() {
        assertEquals(false, test.wordPattern("aaa", "aa aa aa aa"));
    }
}