package ru.dolya.easy.problem66;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {
        int one = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int plusOneValue = digits[i] + one;
            digits[i] = plusOneValue % 10;
            if (plusOneValue / 10 == 0) {
                one = 0;
            }
        }
        if (one == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = one;
            System.arraycopy(digits, 0, result, 1, digits.length);
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
