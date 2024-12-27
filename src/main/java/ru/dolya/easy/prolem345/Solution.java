package ru.dolya.easy.prolem345;

import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] string = s.toCharArray();
        int left = 0;
        int right = string.length - 1;
        boolean leftCont;
        boolean rightCont;
        while (left <= right) {
            if (vowels.contains(string[left])) {
                leftCont = true;
            } else {
                left++;
                leftCont = false;
            }
            if (vowels.contains(string[right])) {
                rightCont = true;
            } else {
                right--;
                rightCont = false;
            }
            if (leftCont && rightCont) {
                char temp = string[left];
                string[left] = string[right];
                string[right] = temp;
                left++;
                right--;
            }
        }
        return new String(string);
    }
}
