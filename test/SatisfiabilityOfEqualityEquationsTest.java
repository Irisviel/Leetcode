import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SatisfiabilityOfEqualityEquationsTest {

    @Test
    void equationsPossible1() {
        assertEquals(false, SatisfiabilityOfEqualityEquations.equationsPossible(new String[]{"a==b", "b==c", "a==c", "a!=c", "d==e", "f==g", "t!=u"}));
    }

    @Test
    void equationsPossible2() {
        assertEquals(true, SatisfiabilityOfEqualityEquations.equationsPossible(new String[]{"c==c", "b==d", "x!=z"}));
    }
}