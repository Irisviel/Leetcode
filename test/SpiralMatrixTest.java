import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {
    SpiralMatrix test = new SpiralMatrix();

    @Test
    void spiralOrderOneRow() {
        int[][] input = new int[][]{{1, 2, 3, 4, 5, 6}};
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrderOneColumn() {
        int[][] input = new int[][]{{1}, {2}, {3}, {4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrder1() {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrder2() {
        int[][] input = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrder3() {
        int[][] input = new int[][]{{2, 5, 8}, {4, 0, -1}};
        List<Integer> expected = List.of(2, 5, 8, -1, 0, 4);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrder4() {
        int[][] input = new int[][]{{1, 2}, {3, 4}};
        List<Integer> expected = List.of(1, 2, 4, 3);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }

    @Test
    void spiralOrder5() {
        int[][] input = new int[][]{{2, 5}, {8, 4}, {0, -1}};
        List<Integer> expected = List.of(2, 5, 4, -1, 0, 8);
        List<Integer> actual = test.spiralOrder(input);
        assertEquals(expected, actual);
    }
}