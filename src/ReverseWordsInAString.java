/*
 * 151. Reverse Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/description/
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * Constraints:
 * 1 <= s.length <= 10e4
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 */

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int end = s.length() - 1;    // Word end seek pointer
        if (s.length() == 1 && !Character.isWhitespace(s.charAt(0))) {
            return s;
        }
        boolean word = !Character.isWhitespace(s.charAt(s.length() - 1));
        boolean first = true;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (word) {
                if (Character.isWhitespace(s.charAt(i))) {
                    word = false;
                    if (!first) {
                        result.append(" ");
                    } else {
                        first = false;
                    }
                    result.append(s, i + 1, end + 1);
                } else if (i == 0) {
                    if (!first) {
                        result.append(" ");
                    } else {
                        first = false;
                    }
                    result.append(s, i, end + 1);
                } else {

                }
            } else {
                if (Character.isWhitespace(s.charAt(i))) {
                } else if (i == 0) {
                    if (!first) {
                        result.append(" ");
                    } else {
                        first = false;
                    }
                    result.append(s, 0, 1);
                } else {
                    word = true;
                    end = i;
                }
            }
        }
        return result.toString();
    }
}
