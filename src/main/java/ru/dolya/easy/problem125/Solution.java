package ru.dolya.easy.problem125;

public class Solution {

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }


    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = removeSpecialCharacters(s);
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String removeSpecialCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
