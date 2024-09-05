/*
 * 925. Long Pressed Name
 * https://leetcode.com/problems/long-pressed-name/description/
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 */
public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if ((i > 0) && (name.charAt(i - 1) == typed.charAt(j))) {
                j++;
            } else {
                if (j == 0) {
                    return false;
                }
                return false;
            }
        }
        while (i == name.length() && j < typed.length()) {
            if (name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length() && j == typed.length();
    }
}