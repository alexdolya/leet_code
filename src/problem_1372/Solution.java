package problem_1372;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * You are given the root of a binary tree.
 * <p>
 * A ZigZag path for a binary tree is defined as follow:
 * <p>
 * Choose any node in the binary tree and a direction (right or left).
 * If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
 * Change the direction from right to left or from left to right.
 * Repeat the second and third steps until you can't move in the tree.
 * Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
 * <p>
 * Return the longest ZigZag path contained in that tree.
 */

public class Solution {

    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(1, null, null);
        TreeNode node7 = new TreeNode(1, null, node8);
        TreeNode node6 = new TreeNode(1, null, null);
        TreeNode node5 = new TreeNode(1, null, node7);
        TreeNode node4 = new TreeNode(1, node5, node6);
        TreeNode node3 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(1, node3, node4);
        TreeNode root = new TreeNode(1,null,node2);
    }



    public int longestZigZag(TreeNode root) {
        return 0;
    }

    public void nextNode(TreeNode node){

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





