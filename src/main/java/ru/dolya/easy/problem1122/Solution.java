package ru.dolya.easy.problem1122;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        int[] arr11 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr12 = new int[]{2, 1, 4, 3, 9, 6};

        int[] arr21 = new int[]{28, 6, 22, 8, 44, 17};
        int[] arr22 = new int[]{22, 28, 8, 6};

        System.out.println(Arrays.toString(relativeSortArray(arr11, arr12)));
        System.out.println(Arrays.toString(relativeSortArray(arr21, arr22)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int pos = 0;
        for (int num : arr2){
            Integer count = map.remove(num);
            for (int i = 0; i < count; i++) {
                arr1[pos] = num;
                pos++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue(); i++) {
                arr1[pos] = entry.getKey();
                pos++;
            }
        }
        return arr1;
    }
}
