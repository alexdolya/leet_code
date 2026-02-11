package ru.dolya.medium.problem437;

public class Solution {

    static int counter = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);

        root.left.right.right = new TreeNode(1);

        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);

        System.out.println(pathSum(root, 8));
    }

    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        branchSum(root, targetSum, 0);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return counter;
    }

    public static void branchSum(TreeNode root, int targetSum, long sum) {
        if (root == null) {
            return;
        }
        sum = sum + root.val;
        if (sum == targetSum) {
            counter++;
        }
        branchSum(root.left, targetSum, sum);
        branchSum(root.right, targetSum, sum);
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
