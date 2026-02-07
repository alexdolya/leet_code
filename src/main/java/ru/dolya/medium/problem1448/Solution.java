package ru.dolya.medium.problem1448;

import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);

        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(goodNodes(root));
    }

    static int counter;

    public static int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, root.val);
        return counter;
    }

    private static void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            counter++;
        }
        int newMax = Math.max(max, root.val);
        dfs(root.left, newMax);
        dfs(root.right, newMax);
    }

    public static int goodNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        set.add(root.val);
        return countBranch(root.left, set) + countBranch(root.right, set) + 1;
    }

    private static int countBranch(TreeNode root, TreeSet<Integer> set) {
        if (root == null) {
            return 0;
        }

        Integer last = set.getLast();

        int result = 0;
        if (last != null && last <= root.val) {
            result = 1;
        }
        int leftCounter = 0;
        int rightCounter = 0;

        set.add(root.val);

        if (root.left != null) {
            leftCounter = countBranch(root.left, new TreeSet<>(set));
        }

        if (root.right != null) {
            rightCounter = countBranch(root.right, new TreeSet<>(set));
        }

        return result + leftCounter + rightCounter;
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
