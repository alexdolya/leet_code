package ru.dolya.easy.problem1732;

public class Solution {

    public int largestAltitude(int[] gain) {
        int result = 0;
        int currentAlt = 0;
        for (int alt : gain) {
            currentAlt += alt;
            result = Math.max(result, currentAlt);
        }
        return result;
    }
}
