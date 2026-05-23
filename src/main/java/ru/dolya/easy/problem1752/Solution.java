package ru.dolya.easy.problem1752;

public class Solution {

    public static void main(String[] args) {
        System.out.println(check(new int[]{3, 4, 5, 1, 2}));
    }

    public static boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean rotated = nums[0] >= nums[nums.length - 1];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < prev) {
                if (rotated) {
                    rotated = false;
                } else {
                    return false;
                }
            }
            prev = nums[i];
        }
        return true;
    }
}
