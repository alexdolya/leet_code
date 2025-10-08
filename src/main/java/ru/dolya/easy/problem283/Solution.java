package ru.dolya.easy.problem283;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ints[j] = nums[i];
                j++;
            }
        }
        System.arraycopy(ints, 0, nums, 0, nums.length);
    }
}
