/*
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/description/
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        boolean trim = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                trim = true;
                count++;
            } else if (trim) {
                return count;
            }
        }
        return count;
    }
}