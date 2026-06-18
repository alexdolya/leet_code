package ru.dolya.medium.prblem1344;

public class Solution {

    public static void main(String[] args) {
        System.out.println(angleClock(12, 30));
    }

    public static double angleClock(int hour, int minutes) {
        double hourAngle = (hour * 30) + ((double) minutes / 60 * 30);
        double minAngle = minutes * 6;

        double max = Math.max(hourAngle, minAngle);
        double min = Math.min(hourAngle, minAngle);

        double result = max - min;
        if (result > 180) {
            result = 180 - (result - 180);
        }
        return result;
    }
}
