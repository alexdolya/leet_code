package ru.dolya.medium.problem3612;

public class Solution {

    public static void main(String[] args) {
        processStr("p##");
    }

    public static String processStr(String s) {
        char[] cArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : cArr) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            }
            if (c == '%') {
                sb.reverse();
            }
            String string = sb.toString();

            if (c == '#' && !string.isEmpty()) {
                sb.append(string);
            }
            if (c == '*' && !string.isEmpty()) {
                sb.deleteCharAt(string.length() - 1);
            }
        }
        return sb.toString();
    }
}
