package ru.dolya.easy.problem643;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double result = (double) currentSum / k;

        int left = 1;
        int right = k;

        while (right < nums.length) {
            currentSum = currentSum - nums[left - 1] + nums[right];
            result = Math.max(result, (double) currentSum / k);
            left++;
            right++;
        }

        return result;
    }
}
