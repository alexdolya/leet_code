package ru.dolya.easy.problem3633;

public class Solution {

    public static void main(String[] args) {
        System.out.println(earliestFinishTime(
                new int[]{2, 8},
                new int[]{4, 1},
                new int[]{6},
                new int[]{3}
        ));
    }

    public static int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration
    ) {
        int firstResult = helper(landStartTime, landDuration, waterStartTime, waterDuration);
        int secondResult = helper(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(firstResult, secondResult);
    }

    private static int helper(int[] firstTrip, int[] firstTripDuration, int[] secondTrip, int[] secondTripDuration) {
        int result = Integer.MAX_VALUE;
        int earliestFinish = Integer.MAX_VALUE;
        for (int i = 0; i < firstTrip.length; i++) {
            earliestFinish = Math.min(earliestFinish, firstTrip[i] + firstTripDuration[i]);
        }
        for (int i = 0; i < secondTrip.length; i++) {
            result = Math.min(result, Math.max(secondTrip[i], earliestFinish) + secondTripDuration[i]);
        }
        return result;
    }
}
