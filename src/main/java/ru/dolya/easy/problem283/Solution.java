package ru.dolya.easy.problem283;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {1, 0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int zeroPointer = 0;
        for (int nonZeroPointer = 0; nonZeroPointer < nums.length; nonZeroPointer++) {
            if (nums[nonZeroPointer] != 0) {
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[zeroPointer];
                nums[zeroPointer] = temp;
                zeroPointer++;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
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
