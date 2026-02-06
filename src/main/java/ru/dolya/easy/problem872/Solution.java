package ru.dolya.easy.problem872;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        System.out.println(leafSimilar(root1, root2));

        TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(5);
        root3.right = new TreeNode(1);

        root3.left.left = new TreeNode(6);
        root3.left.right = new TreeNode(2);

        root3.left.right.left = new TreeNode(7);
        root3.left.right.right = new TreeNode(4);

        root3.right.left = new TreeNode(9);
        root3.right.right = new TreeNode(8);

        TreeNode root4 = new TreeNode(3);
        root4.left = new TreeNode(5);
        root4.right = new TreeNode(1);

        root4.left.left = new TreeNode(6);
        root4.left.right = new TreeNode(7);

        root4.right.left = new TreeNode(4);
        root4.right.right = new TreeNode(2);

        root4.right.right.left = new TreeNode(9);
        root4.right.right.right = new TreeNode(8);

        System.out.println(leafSimilar(root3, root4));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();

        getLeaf(root1, leafs1);
        getLeaf(root2, leafs2);

        return leafs1.equals(leafs2);
    }

    private static void getLeaf(TreeNode root, List<Integer> leafs) {
        if (root.left == null && root.right == null) {
            leafs.add(root.val);
        }
        if (root.left != null) {
            getLeaf(root.left, leafs);
        }
        if (root.right != null) {
            getLeaf(root.right, leafs);
        }
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
