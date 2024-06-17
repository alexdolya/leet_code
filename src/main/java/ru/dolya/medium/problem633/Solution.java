package ru.dolya.medium.problem633;

public class Solution {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(4));
        System.out.println(judgeSquareSum(9));
        System.out.println(judgeSquareSum(999999999));
    }

    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b % 1 == 0) {
                return true;
            }
        }
        return false;
    }

}
