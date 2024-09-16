import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DailyTemperaturesTest {

    void Process(int[] temperatures, int[] expected) {
        int[] actual = DailyTemperatures.dailyTemperatures(temperatures);
        System.out.println("expected: " + Arrays.toString(expected));
        System.out.println("actual:   " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void Case01() {
        Process(
                new int[]{73, 74, 75, 71, 69, 72, 76, 73},
                new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }

    @Test
    void Case02() {
        Process(
                new int[]{30, 40, 50, 60},
                new int[]{1, 1, 1, 0});
    }

    @Test
    void Case03() {
        Process(
                new int[]{30, 60, 90},
                new int[]{1, 1, 0});
    }

    @Test
    void Case04() {
        Process(
                new int[]{40, 40, 40, 40, 40, 40, 40, 40, 41},
                new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0});
    }

    @Test
    void Case05() {
        Process(
                new int[]{41, 41, 41, 40, 40, 40, 40, 40, 40},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    @Test
    void Case06() {
        Process(
                new int[]{40, 40, 40, 40, 40, 40, 40, 40, 40},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    @Test
    void Case07() {
        Process(
                new int[]{30, 40, 50, 30},
                new int[]{1, 1, 0, 0});
    }

    @Test
    void Case08() {
        Process(
                new int[]{100, 99, 99, 100},
                new int[]{0, 2, 1, 0});
    }

    @Test
    void Case09() {
        Process(
                new int[]{100},
                new int[]{0});
    }

    @Test
    void Case10() {
        Process(
                new int[]{30},
                new int[]{0});
    }

    @Test
    void StressTest1() {
        Random rnd = new Random();
        int[] input = new int[30000];
        for (int i = 0; i < input.length; i++) {
            input[i] = rnd.nextBoolean() ? 71 : 76;
        }
        long start = System.currentTimeMillis();
        DailyTemperatures.dailyTemperatures(input);
        long stop = System.currentTimeMillis();
        Assertions.assertTrue(stop - start < 1000);
    }
}