package ru.dolya.medium.problem1657;

import java.util.*;

public class Solution {

    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();

        for (char c : word1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            list1.add(entry.getValue());
            list2.add(map2.get(entry.getKey()));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
