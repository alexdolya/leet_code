package ru.dolya.easy.problem2574;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10, 4, 8, 3})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int leftSumContainer = 0;
        int rightSumContainer = 0;

        int left = 1;
        int right = nums.length - 2;

        while (left < nums.length && right >= 0) {
            leftSumContainer = leftSumContainer + nums[left - 1];
            leftSum[left] = leftSumContainer;

            rightSumContainer = rightSumContainer + nums[right + 1];
            rightSum[right] = rightSumContainer;

            left++;
            right--;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}