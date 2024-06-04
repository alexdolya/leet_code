package ru.dolya.easy.problem409;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); //7
        System.out.println(longestPalindrome("a")); //1
        System.out.println(longestPalindrome("ccc")); //3

    }

    public static int longestPalindrome(String s) {
        if (s.isBlank()) {
            return 0;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Integer count = charMap.putIfAbsent(charArr[i], 1);
            if (count != null) {
                charMap.put(charArr[i], ++count);
            }
        }
        int result = 0;
        boolean haveMiddleElement = false;
        for (Character c  : charMap.keySet()) {
           if (charMap.get(c) % 2 == 0){
               result += charMap.get(c);
           } else {
               result += charMap.get(c) - 1;
               haveMiddleElement = true;
           }
        }
        return haveMiddleElement ? result + 1 : result;
    }

}
