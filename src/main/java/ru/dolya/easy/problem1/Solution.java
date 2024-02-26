package ru.dolya.easy.problem1;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[j] + nums[i]) == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
