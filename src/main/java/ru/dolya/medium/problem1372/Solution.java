package ru.dolya.medium.problem1372;

public class Solution {

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

    int maxCount = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        root.left.right = new TreeNode(1);

        root.left.right.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);

        root.left.right.left.right = new TreeNode(1);

        System.out.println(longestZigZag(root));
    }

    static int maxVal = 0;

    public static int longestZigZag(TreeNode root) {
        longestZigZagFromCurrent(0, false, root);
        longestZigZagFromCurrent(0, true, root);
        return maxVal;
    }

    private static void longestZigZagFromCurrent(int prevCount, boolean isLeft, TreeNode root) {
        if (root == null) {
            return;
        }

        maxVal = Math.max(maxVal, prevCount);

        if (isLeft) {
            longestZigZagFromCurrent(1, true, root.right);
            longestZigZagFromCurrent(prevCount + 1, false, root.left);
        } else {
            longestZigZagFromCurrent(1, false, root.left);
            longestZigZagFromCurrent(prevCount + 1, true, root.right);
        }
    }
}
