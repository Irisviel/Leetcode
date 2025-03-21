/*
 * 54. Spiral Matrix
 * https://leetcode.com/problems/spiral-matrix/description/
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        if ((m == 1) && (n == 1)) return Collections.singletonList(matrix[0][0]);
        if (n == 1) return Arrays.stream(matrix[0]).boxed().collect(Collectors.toList());
        if (m == 1) return Arrays.stream(matrix).map(item -> item[0]).collect(Collectors.toList());
        if ((m == 2) && (n == 2)) return List.of(matrix[0][0], matrix[0][1], matrix[1][1], matrix[1][0]);
        List<Integer> result = new ArrayList<>(m * n);
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        Direction d = Direction.RIGHT;
        while ((d == Direction.RIGHT && (left <= right))
                || (d == Direction.DOWN && (top <= bottom))
                || (d == Direction.LEFT && (left <= right))
                || (d == Direction.UP && (top <= bottom))) {
            switch (d) {
                case RIGHT:
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);
                    }
                    top++;
                    d = Direction.DOWN;
                    break;
                case DOWN:
                    for (int k = top; k <= bottom; k++) {
                        result.add(matrix[k][right]);
                    }
                    right--;
                    d = Direction.LEFT;
                    break;
                case LEFT:
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                    d = Direction.UP;
                    break;
                case UP:
                    for (int k = bottom; k >= top; k--) {
                        result.add(matrix[k][left]);
                    }
                    left++;
                    d = Direction.RIGHT;
                    break;
            }
        }
        return result;
    }

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    // not working probably in many cases
//    public List<Integer> spiralOrderFail(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        if ((m == 1) && (n == 1)) return Collections.singletonList(matrix[0][0]);
//        if (n == 1) return Arrays.stream(matrix[0]).boxed().collect(Collectors.toList());
//        if (m == 1) return Arrays.stream(matrix).map(item -> item[0]).collect(Collectors.toList());
//        if ((m == 2) && (n == 2)) return List.of(matrix[0][0], matrix[0][1], matrix[1][1], matrix[1][0]);
//        List<Integer> result = new ArrayList<>(m * n);
//        int x = 0;
//        int y = 0;
//        Direction d = Direction.RIGHT;
//        while ((d == Direction.RIGHT && (x <= m / 2))
//                || (d == Direction.DOWN && (y <= n / 2))
//                || (d == Direction.LEFT && (x >= m / 2))
//                || (d == Direction.UP && (y >= n / 2))) {
//            switch (d) {
//                case RIGHT:
//                    for (int i = x; i <= (m - x - 1); i++) {
//                        result.add(matrix[y][i]);
//                    }
//                    x = m - x - 1;
//                    y = y + 1;  // Cause next direction is DOWN
//                    d = Direction.DOWN;
//                    break;
//                case DOWN:
//                    for (int k = y; k <= (n - y); k++) {
//                        result.add(matrix[k][x]);
//                    }
//                    x = x - 1;
//                    y = n - y;
//                    d = Direction.LEFT;
//                    break;
//                case LEFT:
//                    for (int i = x; i >= (m - x - 2); i--) {
//                        result.add(matrix[y][i]);
//                    }
//                    x = m - x - 2;
//                    y = y - 1;
//                    d = Direction.UP;
//                    break;
//                case UP:
//                    for (int k = y; k >= (n - y - 1); k--) {
//                        result.add(matrix[k][x]);
//                    }
//                    x = x + 1;    // Cause next direction is RIGHT
//                    y = n - y - 1;
//                    d = Direction.RIGHT;
//                    break;
//            }
//        }
//        return result;
//    }
}
