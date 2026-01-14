package ru.dolya.medium.problem443;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int letterIndex = 0;
        int letterCountIndex = 1;
        int currentIndex = 1;

        int counter = 1;
        while (currentIndex < chars.length) {
            if (chars[currentIndex] == chars[letterIndex]) {
                counter++;
            } else {
                if (counter != 1) {
                    char[] charArray = String.valueOf(counter).toCharArray();
                    for (char c : charArray) {
                        chars[letterCountIndex] = c;
                        letterCountIndex++;
                    }
                    letterIndex = letterIndex + counter + charArray.length - 1;
                    letterCountIndex = letterIndex + 1;
                } else {
                    letterIndex++;
                    letterCountIndex++;
                }
                counter = 1;
            }
            currentIndex++;
            if (currentIndex == chars.length && counter != 1) {
                char[] charArray = String.valueOf(counter).toCharArray();
                for (char c : charArray) {
                    chars[letterCountIndex] = c;
                    letterCountIndex++;
                }
            }
        }
        return letterCountIndex;
    }
}
