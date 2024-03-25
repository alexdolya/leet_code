package ru.dolya.medium.problem442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given an integer array nums of length n where all the integers of nums are in the range [1, n]
and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.*/

public class Solution {
    public static void main(String[] args) {
        int[] ar1 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int[] ar2 = new int[]{1, 1, 2};
        int[] ar3 = new int[]{1};
        System.out.println(findDuplicates(ar1));
        System.out.println(findDuplicates(ar2));
        System.out.println(findDuplicates(ar3));
    }


    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> storage = new HashSet<>();
        for (int num : nums) {
            if (!storage.add(num)) {
                result.add(num);
            }
        }
        return result;
    }

}

