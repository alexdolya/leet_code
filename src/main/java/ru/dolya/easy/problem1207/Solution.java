package ru.dolya.easy.problem1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occur = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (occur.contains(entry.getValue())) {
                return false;
            }
            occur.add(entry.getValue());
        }
        return true;
    }
}
