package ru.dolya.medium.problem33;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length - 1;

        while (left <= rigth) {
            int mid = (rigth - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < nums[rigth]) {
                if (target > nums[mid] && target <= nums[rigth]) {
                    left = mid + 1;
                } else {
                    rigth = mid - 1;
                }
            } else {
                if (target >= nums[left] && target < nums[mid]) {
                    rigth = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
