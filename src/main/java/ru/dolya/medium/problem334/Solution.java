package ru.dolya.medium.problem334;

public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 4, 5};
//        System.out.println(increasingTriplet(nums));

        int[] nums2 = new int[]{4, 5, 2147483647, 1, 2};
        System.out.println(increasingTriplet(nums2));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int leftMin = nums[0];

        int[] rightMaxArr = new int[nums.length];

        int rightMax = Integer.MIN_VALUE;

        rightMaxArr[rightMaxArr.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            rightMax = Math.max(rightMax, nums[i+1]);
            rightMaxArr[i] = rightMax;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > leftMin && nums[i] < rightMax) {
                return true;
            } else {
                leftMin = Math.min(leftMin, nums[i]);
                rightMax = rightMaxArr[i];
            }
        }
        return false;
    }
}
