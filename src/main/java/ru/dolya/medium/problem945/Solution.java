package ru.dolya.medium.problem945;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2};
        int[] nums2 = new int[]{3, 2, 1, 2, 1, 7};

        System.out.println(minIncrementForUnique(nums1)); //1
        System.out.println(minIncrementForUnique(nums2)); //6
    }

    public static int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int result = 0;
        int lastMax = nums[0];
        set.add(nums[0]);
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if (!set.contains(nums[i])) {
                    set.add(nums[i]);
                    lastMax = nums[i];
                } else {
                    lastMax = lastMax + 1;
                    result += lastMax - nums[i];
                    set.add(lastMax);
                }
            }
        }
        return result;
    }
}
