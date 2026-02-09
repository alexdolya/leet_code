package ru.dolya.medium.prblem1161;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(-200);
        root.right = new TreeNode(-300);

        root.left.left = new TreeNode(-20);
        root.left.right = new TreeNode(-5);

        root.right.left = new TreeNode(-10);

        int i = maxLevelSum(root);
    }

    public static int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int result = root.val;
        int maxLevel = 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            level++;

            int size = queue.size();
            int currentResult = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                currentResult += current.val;

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            if (currentResult > result) {
                result = currentResult;
                maxLevel = level;
            }
        }
        if (maxLevel == 0) {
            maxLevel = 1;
        }
        return maxLevel;
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
