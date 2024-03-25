package ru.dolya.easy.problem1518;


class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWaterBottles(9, 3));
        System.out.println(solution.numWaterBottles(15, 4));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        return numWaterBottlesWithEmpty(numBottles, numExchange, 0);
    }

    private int numWaterBottlesWithEmpty(int numBottles, int numExchange, int emptyBottles) {
        if (numBottles == 0 && emptyBottles / numExchange == 0) {
            return 0;
        }
        return numBottles + emptyBottles / numExchange
                + numWaterBottlesWithEmpty(0, numExchange, numBottles + emptyBottles/numExchange + emptyBottles% numExchange);
    }

}