package ru.dolya.easy.promlem724;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            rightSum -= nums[i];
        }

        return -1;
    }
}
