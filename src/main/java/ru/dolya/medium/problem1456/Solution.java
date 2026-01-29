package ru.dolya.medium.problem1456;

import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxVowels("zpuerktejfp", 3));
    }

    public static int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int currentResult = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentResult++;
            }
        }

        int left = 1;
        int right = k;

        int result = currentResult;
        while (right < s.length()){
            if (vowels.contains(s.charAt(left - 1))) {
                currentResult--;
            }
            if (vowels.contains(s.charAt(right))) {
                currentResult++;
            }
            result = Math.max(result, currentResult);
            if (result == k) {
                return k;
            }
            left++;
            right++;
        }
        return result;
    }
}
