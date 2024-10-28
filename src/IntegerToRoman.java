/*
 * 12. Integer to Roman
 * Given an integer, convert it to a Roman numeral.
 */

class IntegerToRoman {

    public static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static final int[] INTEGERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < INTEGERS.length) {
            if (num >= INTEGERS[i]) {
                num -= INTEGERS[i];
                result.append(ROMAN[i]);
            } else {
                i++;
            }
        }
        return result.toString();
    }
}
