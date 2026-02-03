package ru.dolya.medium.promlem649;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int length = senate.length();
        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            Integer radiantCurrent = radiant.peek();
            Integer direCurrent = dire.peek();
            if (radiantCurrent > direCurrent) {
                dire.offer(length++);
            } else {
                radiant.offer(length++);
            }
            radiant.poll();
            dire.poll();
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
