/*
 * 28. Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

class FindTheIndexOfTheFirstOccurrenceInAString {

    // Naive implementation. Should redo with KMP.
    public int strStr(String haystack, String needle) {
        int start = -1;
        for (int i = 0, j = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                i = i - j;
                j = 0;
                start = -1;
            } else if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) start = i;
                j++;
                if (j == needle.length()) break;
            } else break;
        }
        start = haystack.length() - start >= needle.length() ? start : -1;
        return start;
    }
}
