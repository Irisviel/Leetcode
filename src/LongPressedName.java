/*
 * 925. Long Pressed Name
 * https://leetcode.com/problems/long-pressed-name/description/
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 */
public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) return false;
        int k = 0;
        for (int i = 0; i < name.length(); i++) {
            if ((i < name.length() - 1) && (name.charAt(i + 1) == name.charAt(i))) {
                if (name.charAt(i) != typed.charAt(k)) return false;
                k++;
            } else if ((i < name.length() - 1) && (name.charAt(i + 1) != name.charAt(i))) {
                if (k >= typed.length()) return false;
                if (name.charAt(i) != typed.charAt(k)) return false;
                while ((k < typed.length()) && (name.charAt(i) == typed.charAt(k)))
                    k++;
            } else if ((i == name.length() - 1)) {
                if (k >= typed.length()) return false;
                if (name.charAt(i) != typed.charAt(k)) return false;
            }
        }
        for (int j = k; j < typed.length() - 1; j++) {
            if (typed.charAt(j) != typed.charAt(j + 1)) return false;
        }
        return true;
    }
}