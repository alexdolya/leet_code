package ru.dolya.easy.problem226;


class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        solution.invertTree(treeNode);
        System.out.println();
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tempLeft = root.left;
        root.left = root.right;
        invertTree(root.left);
        root.right = tempLeft;
        invertTree(root.right);
        return root;
    }

}