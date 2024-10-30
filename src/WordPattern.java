/*
 * https://leetcode.com/problems/word-pattern/description/
 * 290. Word Pattern
 * Given a pattern and a string s, find if s follows the same pattern. pattern and s are same if:
 * Each character in pattern represents a word in s
 * No two distinct characters in pattern can represent the same word in s
 * No single character in pattern can represent two distinct words in s.
 */

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<String, Character> map = new HashMap<>();
        boolean[] charMet = new boolean[26];
        for (int i = 0; i < pattern.length(); i++) {
            String key = words[i];
            if (!map.containsKey(key)) {
                boolean keyAlreadyMapped = charMet[pattern.charAt(i) - 97];
                if (keyAlreadyMapped) {
                    return false;
                }
                map.put(key, pattern.charAt(i));
                charMet[pattern.charAt(i) - 97] = true;
            } else if (!map.get(key).equals(pattern.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}