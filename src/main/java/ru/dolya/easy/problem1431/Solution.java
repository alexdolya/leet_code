package ru.dolya.easy.problem1431;

import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */

public class Solution {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> result = Solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int j : candies) {
            if (j > max) {
                max = j;
            }
        }
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}

