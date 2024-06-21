package ru.dolya.easy.problem20;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

        String s2 = "([]){}";
        System.out.println(isValid(s2));

        String s3 = "]";
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            }
            if (stack.isEmpty()) {
                return false;
            }
            Character peekedChar = stack.peek();
            if (peekedChar == null) {
                return false;
            }
            if (s.charAt(i) == ')') {
                if (peekedChar.equals('(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (peekedChar.equals('{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (peekedChar.equals('[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
