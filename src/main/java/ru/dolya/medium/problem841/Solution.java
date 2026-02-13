package ru.dolya.medium.problem841;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), Collections.emptyList())));
        System.out.println(canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.isEmpty()) {
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        Stack<List<Integer>> stack = new Stack<>();

        stack.push(rooms.getFirst());
        visited.add(0);

        while (!stack.isEmpty()) {
            List<Integer> keys = stack.pop();
            for (Integer key : keys) {
                if (!visited.contains(key)) {
                    stack.push(rooms.get(key));
                    visited.add(key);
                }
            }
        }

        return visited.size() == rooms.size();
    }
}
