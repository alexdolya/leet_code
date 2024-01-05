package ru.dolya.easy.problem_13;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */

public class Solution {

    public static void main(String[] args) {
        //3
        System.out.println(romanToInt("III"));
        //4
        System.out.println(romanToInt("IV"));
        //58
        System.out.println(romanToInt("LVIII"));
        //1994
        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ((charArr[i] == 'I' || charArr[i] == 'X' || charArr[i] == 'C') && i + 1 < charArr.length) {
                if (charArr[i] == 'I' && charArr[i + 1] == 'X') {
                    result += 9;
                    i = i + 1;
                } else if (charArr[i] == 'I' && charArr[i + 1] == 'V') {
                    result += 4;
                    i = i + 1;
                } else if (charArr[i] == 'X' && charArr[i + 1] == 'L') {
                    result += 40;
                    i = i + 1;
                } else if (charArr[i] == 'X' && charArr[i + 1] == 'C') {
                    result += 90;
                    i = i + 1;
                } else if (charArr[i] == 'C' && charArr[i + 1] == 'D') {
                    result += 400;
                    i = i + 1;
                } else if (charArr[i] == 'C' && charArr[i + 1] == 'M') {
                    result += 900;
                    i = i + 1;
                } else {
                    result += getInt(charArr[i]);
                }
            }else {
                result += getInt(charArr[i]);
            }
        }
        return result;
    }

    private static int getInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
