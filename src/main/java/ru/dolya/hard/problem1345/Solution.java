package ru.dolya.hard.problem1345;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}));
    }

    public static int minJumps(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        if (arr.length == 2) {
            return 1;
        }
        for (int num : arr) {
            Integer orDefault = map.getOrDefault(num, 0);
            map.put(num, orDefault + 1);
        }
        return jump(arr, 0, 0);
    }

    public static int jump(int[] arr, int ind, int result) {
        if (ind == arr.length - 1) {
            return 0;
        }
        int right = 0;
        if (ind + 1 < arr.length) {
            right = result + jump(arr, ind + 1, result +1 );
        }
        int left = 0;
        if (ind - 1 >= 0) {
            left = result + jump(arr, ind + 1, result +1 );
        }
        int currentResult = Math.min(right, left);

        Integer ind1 = map.get(arr[ind]);
        if (ind1 != null) {
            currentResult = Math.min(currentResult, result + jump(arr, ind1, result + 1));

        }
        return currentResult;
    }

}
