package ru.dolya.easy.problem1051;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] heights1 = new int[]{1, 1, 4, 2, 1, 3};
        int[] heights2 = new int[]{5, 1, 2, 3, 4};
        int[] heights3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(heightChecker(heights1)); //3
        System.out.println(heightChecker(heights2)); //5
        System.out.println(heightChecker(heights3)); //0
    }

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        int result = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }

}
