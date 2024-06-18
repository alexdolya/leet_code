package ru.dolya.medium.problem826;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] difficulty = new int[]{2, 4, 6, 8, 10};
        int[] profit = new int[]{10, 20, 30, 40, 50};
        int[] worker = new int[]{4, 5, 6, 7};

        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<Job> jobs = new LinkedList<>();
        for (int i = 0; i < difficulty.length; i++) {
            jobs.add(new Job(profit[i], difficulty[i]));
        }
        jobs.sort(Comparator.comparingInt(job -> job.profit));
        Arrays.sort(worker);
        int workerPointer = worker.length - 1;
        int result = 0;
        for (int i = jobs.size() - 1; i >= 0 ; i--) {
            Job job = jobs.get(i);
            while (workerPointer >= 0)
                if (job.difficulty <= worker[workerPointer]) {
                    result += job.profit;
                    workerPointer--;
                } else {
                    break;
                }
        }
        return result;
    }

    static class Job {

        public Job(int profit, int difficulty) {
            this.profit = profit;
            this.difficulty = difficulty;
        }

        int profit;
        int difficulty;
    }

}

