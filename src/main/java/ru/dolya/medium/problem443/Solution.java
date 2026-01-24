package ru.dolya.medium.problem443;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(arr));
        System.out.println(Arrays.toString(arr));

        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(compress(arr1));
        System.out.println(Arrays.toString(arr1));
    }

    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        StringBuilder sb = new StringBuilder();

        int currentCounter = 1;
        char currentChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCounter++;
            } else {
                sb.append(currentChar);
                if (currentCounter > 1) {
                    sb.append(currentCounter);
                }
                currentCounter = 1;
                currentChar = chars[i];
            }
            if (i == chars.length - 1) {
                sb.append(currentChar);
                if (currentCounter > 1) {
                    sb.append(currentCounter);
                }
            }
        }

        char[] charArray = sb.toString().toCharArray();
        System.arraycopy(charArray, 0, chars, 0, charArray.length);
        return charArray.length;
    }
}
