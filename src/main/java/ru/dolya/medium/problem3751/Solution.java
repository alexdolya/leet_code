package ru.dolya.medium.problem3751;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(totalWaviness(120, 130));
    }
    public static int totalWaviness(int num1, int num2) {
        int result = 0;
        for (int num = num1; num <= num2; num++) {
            List<Integer> digits = new ArrayList<>();
            int currentNum = num;
            while (currentNum / 10 != 0) {
                digits.add(currentNum % 10);
                currentNum = currentNum / 10;
            }
            digits.add(currentNum % 10);

            if (digits.size() < 3) {
                continue;
            }

            digits = digits.reversed();
            for (int i = 1; i < digits.size() - 1; i++) {
                if ((digits.get(i) > digits.get(i - 1) && digits.get(i) > digits.get(i + 1))
                    || (digits.get(i) < digits.get(i - 1) && digits.get(i) < digits.get(i + 1))) {
                    result++;
                }
            }
        }
        return result;
    }
}