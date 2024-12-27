package ru.dolya.medium.problem151;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));

    }

    public static String reverseWords(String s) {
        String[] array = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
