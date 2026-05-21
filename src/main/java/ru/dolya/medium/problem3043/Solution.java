package ru.dolya.medium.problem3043;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new int[]{1, 10, 100}, new int[]{1000}));
    }

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = new HashSet<>();

        for (int num : arr1) {
            while (!prefixes.contains(num) && num > 0) {
                prefixes.add(num);
                num = num/ 10;
            }
        }
        int result = 0;
        for (int num : arr2) {
            while (num > 0 && !prefixes.contains(num)) {
                num = num / 10;
            }
            if (num > 0) {
                result = Math.max(result, findLength(num));
            }
        }
        return result;
    }

    public static int findLength(int num) {
        int result = 0;
        while (num != 0) {
            num = num / 10;
            result++;
        }
        return result;
    }
}
