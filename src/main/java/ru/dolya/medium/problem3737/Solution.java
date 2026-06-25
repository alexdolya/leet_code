package ru.dolya.medium.problem3737;

public class Solution {

    public int countMajoritySubarrays(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    counter++;
                }
                else {
                    counter--;
                }
                if (counter > 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
