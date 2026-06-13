package ru.dolya.easy.problem3838;

public class Solution {

    public static void main(String[] args) {
        System.out.println(mapWordWeights(
                new String[]{"abcd", "def", "xyz"},
                new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2})
        );

        System.out.println(mapWordWeights(
                new String[]{"kim"},
                new int[]{6,9,4,4,2,8,9,4,9,5,8,10,8,8,8,5,4,4,1,6,2,3,10,3,4,3})
        );
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] wordArr = word.toCharArray();
            int weightSum = 0;
            for (char c : wordArr) {
                int weightIndex = c - 97;
                weightSum += weights[weightIndex];
            }
            weightSum %= 26;
            result.append((char) ('a' + (25 - weightSum)));
        }
        return result.toString();
    }
}