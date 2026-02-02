package ru.dolya.medium.problem735;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{3, 5, -6, 2, -1, 4})));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {
            boolean isAlive = true;
            while (!stack.isEmpty() && (current < 0 && stack.peek() > 0)) {
                if (stack.peek() < -current) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -current) {
                    stack.pop();
                }
                isAlive = false;
                break;
            }
            if (isAlive) {
                stack.push(current);
            }
        }

        int stackSize = stack.size();
        int[] result = new int[stackSize];
        for (int i = stackSize - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}


// 5 10 -5