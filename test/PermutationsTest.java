import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PermutationsTest {
    Permutations p = new Permutations();

    @Test
    void permute1() {
        List<List<Integer>> permute = p.permute(new int[]{1, 2, 3});

        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        bruteCheck(expected, permute);
    }

    void bruteCheck(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        for (List<Integer> item : expected) {
            boolean found = false;
            for (int i = 0; i < actual.size() && !found; i++) {
                boolean equal = true;
                List<Integer> actualItem = actual.get(i);
                for (int j = 0; j < item.size() && equal; j++) {
                    if (!item.get(j).equals(actualItem.get(j))) {
                        equal = false;
                    }
                }
                if (equal) found = true;
            }
            if (!found) {
                System.out.println("Could not find permutation in actual result: " + item.toString());
                fail();
            }
        }
    }
}
