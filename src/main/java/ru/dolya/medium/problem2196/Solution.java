package ru.dolya.medium.problem2196;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[][] array = {
                {20, 15, 1},
                {20, 17, 0},
                {50, 20, 1},
                {50, 80, 0},
                {80, 19, 1}
        };

        TreeNode binaryTree = createBinaryTree(array);
        System.out.println();
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        TreeNode result = null;
        Set<Integer> children = new HashSet<>();
        for (int[] currentDesc : descriptions) {
            TreeNode currentNode = map.computeIfAbsent(currentDesc[1], k -> new TreeNode(currentDesc[1]));
            children.add(currentDesc[1]);
            TreeNode parentOfCurrent = map.get(currentDesc[0]);
            if (parentOfCurrent == null) {
                parentOfCurrent = new TreeNode(currentDesc[0]);
                map.put(currentDesc[0], parentOfCurrent);
                result = parentOfCurrent;
            }
            boolean isLeft = currentDesc[2] == 1;
            if (isLeft) {
                parentOfCurrent.left = currentNode;
            } else {
                parentOfCurrent.right = currentNode;
            }
        }

        for (TreeNode node : map.values()) {
            if (!children.contains(node.val)) {
                return node;
            }
        }
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
