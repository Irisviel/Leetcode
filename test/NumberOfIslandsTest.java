import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    void numIslands1() {
        char[][] data = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        assertEquals(1, numberOfIslands.numIslands(data));
    }

    @Test
    void numIslands2() {
        char[][] data = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        assertEquals(3, numberOfIslands.numIslands(data));
    }

    @Test
    void numIslands3() {
        char[][] data = new char[][]{
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1'}};
        assertEquals(3, numberOfIslands.numIslands(data));
    }

    @Test
    void numIslands4() {
        char[][] data = new char[][]{
                {'1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '1', '1', '1', '1'}};
        assertEquals(3, numberOfIslands.numIslands(data));
    }

    @Test
    void numIslands5() {
        char[][] data = new char[][]{
                {'1', '1', '1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1', '1', '1'},
                {'0', '0', '0', '0', '0', '0', '0'}};
        assertEquals(2, numberOfIslands.numIslands(data));
    }

    @Test
    void stressTest1() {
        Random rnd = new Random();
        char[][] data = new char[300][300];
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                data[i][j] = rnd.nextBoolean() ? '1' : '0';
            }
        }
        numberOfIslands.numIslands(data);
    }
}