package ru.dolya.easy.problem_9;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(212));
        System.out.println(isPalindrome(113));
        System.out.println(isPalindrome(414));

    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return s.contentEquals(sb.reverse());
    }
}
