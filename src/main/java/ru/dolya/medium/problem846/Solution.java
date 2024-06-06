package ru.dolya.medium.problem846;

/*
Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize,
and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize,
return true if she can rearrange the cards, or false otherwise.

Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
Example 2:

Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.

 */

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int[] hand1 = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize1 = 3;
        System.out.println(isNStraightHand(hand1, groupSize1));

        int[] hand2 = new int[]{1, 2, 3, 4, 5};
        int groupSize2 = 4;
        System.out.println(isNStraightHand(hand2, groupSize2));

    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (!map.isEmpty()) {
            Integer current = map.entrySet().iterator().next().getKey();
            for (int i = 1; i < groupSize; i++) {
                if (!map.containsKey(current + i)){
                    return false;
                }
                Integer currentCount = map.get(current+ i);
                currentCount -= 1;
                if (currentCount == 0){
                    map.remove(current + i);
                } else {
                    map.put(current + i, currentCount);
                }
            }
            Integer currentCount = map.get(current);
            currentCount -= 1;
            if (currentCount == 0){
                map.remove(current);
            } else {
                map.put(current, currentCount);
            }
        }
        return true;
    }

}


















