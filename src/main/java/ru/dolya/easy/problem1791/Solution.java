package ru.dolya.easy.problem1791;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[][] edges = new int[][]{new int[]{1, 2}, new int[]{2, 3}, new int[]{4, 2}};
        System.out.println(findCenter(edges));
    }

    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            for (int i : edge) {
                Integer num = map.get(i);
                if (num == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, ++num);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == edges.length){
                return entry.getKey();
            }
        }
        return 0;
    }
}
