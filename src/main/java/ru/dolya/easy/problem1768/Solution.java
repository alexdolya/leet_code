package ru.dolya.easy.problem1768;

public class Solution {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("abcd", "pq"));
        System.out.println(mergeAlternately("ab", "pqrs"));

    }

    public static String mergeAlternately(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        char[] result = new char[charArray1.length + charArray2.length];
        int index1 = 0;
        int index2 = 0;

        boolean isFirstWord = true;
        for (int i = 0; i < result.length; i++) {
            if (isFirstWord) {
                if (index1 < charArray1.length) {
                    result[i] = charArray1[index1];
                    index1++;
                    isFirstWord = false;
                } else {
                    result[i] = charArray2[index2];
                    index2++;
                }
            } else {
                if (index2 < charArray2.length) {
                    result[i] = charArray2[index2];
                    index2++;
                    isFirstWord = true;
                } else {
                    result[i] = charArray1[index1];
                    index1++;
                }
            }
        }
        return new String(result);
    }
}
