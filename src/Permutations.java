/*
 * 46. Permutations
 * https://leetcode.com/problems/permutations/description/
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 * Constraints:
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>(factorial(nums.length));
        next(new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return result;
    }

    private void next(List<Integer> accum, List<Integer> remaining) {
        for (int i = 0; i < remaining.size(); i++) {
            ArrayList<Integer> accumNew = new ArrayList<>(accum);
            accumNew.add(remaining.get(i));
            ArrayList<Integer> remainingNew = new ArrayList<>(remaining);
            if (remainingNew.size() == 1) {
                result.add(accumNew);
            } else {
                remainingNew.remove(i);
                next(accumNew, remainingNew);
            }
        }
    }

    private static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
