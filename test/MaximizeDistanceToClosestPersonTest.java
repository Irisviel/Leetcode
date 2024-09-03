import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeDistanceToClosestPersonTest {
    @Test
    void case01() {
        int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};
        assertEquals(2, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case02() {
        int[] seats = new int[]{1, 0, 0, 0};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case03() {
        int[] seats = new int[]{1, 0, 0, 0, 0};
        assertEquals(4, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case04() {
        int[] seats = new int[]{0, 0, 0, 1};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case05() {
        int[] seats = new int[]{0, 0, 0, 0, 1};
        assertEquals(4, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case06() {
        int[] seats = new int[]{1, 0};
        assertEquals(1, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case07() {
        int[] seats = new int[]{0, 1};
        assertEquals(1, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case08() {
        int[] seats = new int[]{1, 1, 1, 0, 1};
        assertEquals(1, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case09() {
        int[] seats = new int[]{0, 1, 0, 1, 0};
        assertEquals(1, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case10() {
        int[] seats = new int[]{0, 0, 1, 0, 1, 0, 0};
        assertEquals(2, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case11() {
        int[] seats = new int[]{0, 0, 0, 1, 0, 1, 0, 0};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case12() {
        int[] seats = new int[]{0, 0, 1, 0, 1, 0, 0, 0};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case13() {
        int[] seats = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 0};
        assertEquals(2, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case14() {
        int[] seats = new int[]{1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0};
        assertEquals(4, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case15() {
        int[] seats = new int[]{1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        assertEquals(5, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case16() {
        int[] seats = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(9, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    void case17() {
        int[] seats = new int[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistToClosest(seats));
    }
}