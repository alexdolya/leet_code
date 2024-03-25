package ru.dolya.medium.problem930;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println(solution.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0));
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == goal) {
                counter++;
            }
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == goal) {
                    counter++;
                }
                if (sum > goal) {
                    break;
                }
            }
        }
        return counter;
    }

}

