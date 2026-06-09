package ru.dolya.medium.problem3689;

public class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return ((long) (max - min)) * k;
    }
}
