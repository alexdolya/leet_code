package ru.dolya.medium.problem236;

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

    public static void main(String[] args) {

    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode treeNode1 = lowestCommonAncestor(root.left, p, q);
        TreeNode treeNode2 = lowestCommonAncestor(root.right, p, q);
        if (treeNode1 != null && treeNode2 != null) {
            return root;
        }

        if (treeNode1 != null) {
            return treeNode1;
        }
        return treeNode2;
    }
}
