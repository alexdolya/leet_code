package ru.dolya.medium.problem2390;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : stack) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
