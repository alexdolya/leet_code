package ru.dolya.medium.problem238;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }

        postfix[postfix.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = postfix[i + 1];
            } else if (i == result.length - 1) {
                result[i] = prefix[i - 1];

            } else {
                result[i] = prefix[i - 1] * postfix[i + 1];
            }
        }

        return result;
    }
}
