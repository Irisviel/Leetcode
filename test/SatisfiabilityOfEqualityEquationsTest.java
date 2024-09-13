import LongestConsecutiveSequence.SatisfiabilityOfEqualityEquations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SatisfiabilityOfEqualityEquationsTest {

    @Test
    void equationsPossible1() {
        assertFalse(SatisfiabilityOfEqualityEquations.equationsPossible(new String[]{"a==b", "b==c", "a==c", "a!=c", "d==e", "f==g", "t!=u"}));
    }

    @Test
    void equationsPossible2() {
        assertTrue(SatisfiabilityOfEqualityEquations.equationsPossible(new String[]{"c==c", "b==d", "x!=z"}));
    }
}